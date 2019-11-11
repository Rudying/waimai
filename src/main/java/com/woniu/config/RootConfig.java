package com.woniu.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class RootConfig {
   
	@Bean //配置数据源
	public DataSource ds() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/waimai?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
	}
	
	@Bean //配置加密方式
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	@Bean //配置realm
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(ds());
		realm.setAuthenticationQuery("select password, salt from users where username = ?");
		realm.setUserRolesQuery("select rname from users_roles ur join users u on ur.uid = u.uid join roles r on ur.rid = r.rid where username = ?");
		realm.setPermissionsQuery("select pname from roles_permissions rp join roles r on rp.rid = r.rid join permissions p on rp.pid = p.pid where rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}
	
	@Bean //配置安全管理器
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}
	
	@Bean //配置shiro
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean sf = new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		//设置用户没有通过认证的页面
		sf.setLoginUrl("/index.html");
		//设置权限不够默认跳转的页面
		sf.setUnauthorizedUrl("/unauthorized.html");
		
		Map<String, String> map = new HashMap<>();
		//不需要认证就可以访问的url
		map.put("/users.html", "anon");
		map.put("/users", "anon");
		map.put("/users/*", "anon");
		map.put("/users/login", "anon");
		map.put("/logout", "logout");
		//认证成功才可以访问的url
		map.put("/**", "authc");
		sf.setFilterChainDefinitionMap(map);
		return sf;
	}
	
}
