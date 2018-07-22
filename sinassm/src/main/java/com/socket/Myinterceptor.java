package com.socket;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

public class Myinterceptor implements HandshakeInterceptor {


	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler,
			Map<String, Object> map) throws Exception {
		
		ServletServerHttpRequest sshr=(ServletServerHttpRequest) request;
		HttpSession session = sshr.getServletRequest().getSession();
		System.out.println("beforeHandshake");
		if(session!=null){
			map.put("userId",session.getAttribute("userId"));
		}
		
		
		
		return true;
	}

	@Override
	public void afterHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1, WebSocketHandler arg2, Exception arg3) {
		
	}
}
