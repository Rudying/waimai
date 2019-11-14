package com.woniu.util;

import java.util.Map;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.woniu.web.controller.UserController;

@WebListener
public class WebSessionLisener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session 创建----"+se.getSource());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		Map<String, String> map = UserController.map;
		
		for (String key : map.keySet()) {
            String sessionID = map.get(key);
            if(sessionID.equals(se.getSession().toString())) {
            	UserController.map.remove(key);
            }
        }
		System.out.println("Session 销毁---"+se.getSession());
	}
}
