package com.woniu.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;

public class duanxin {
	public static void main(String[] args) {
	    String host = "http://yzxtz.market.alicloudapi.com";
	    String path = "/yzx/notifySms";
	    String method = "POST";
	    String appcode = "cdd7175e1f7a42dbbf8d8a5cddb02a9f";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("phone", "15719188191");
	    querys.put("templateId", "m1au3z3z7w93nwfwk14zjmwi9dbith5w");
	    querys.put("variable", "num:666,money:888");
	    Map<String, String> bodys = new HashMap<String, String>();


	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
	    	System.out.println(response.toString());
	    	//获取response的body
	    	//System.out.println(EntityUtils.toString(response.getEntity()));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}
}
