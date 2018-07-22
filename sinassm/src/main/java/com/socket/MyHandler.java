package com.socket;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
@Service
public class MyHandler extends TextWebSocketHandler {
	 private static final Map<Integer, WebSocketSession> users;
	    //用户标识
	    private static final String CLIENT_ID = "userId";

	    static {
	        users = new HashMap<>();
	    }
	
	
	
	@Override
	protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
		// TODO Auto-generated method stub
		super.handleBinaryMessage(session, message);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		// TODO Auto-generated method stub
		
		super.afterConnectionClosed(session, status);
	}

	//连接建立完成后，可以自动执行的逻辑
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("");  System.out.println("成功建立连接");
        Integer userId = getClientId(session);
        System.out.println(userId);
        if(userId!=null){
        	users.put(userId,session);
        	session.sendMessage(new TextMessage("success connect"));
        	System.out.println(userId);
        	System.out.println(session);
        	
        }
        
		
	
	}
	public boolean sendMessageToUser(int i, TextMessage textMessage) {
		// TODO Auto-generated method stub
		WebSocketSession session=users.get(i);
		try {
		if (session.isOpen()){
			session.sendMessage(textMessage);
			return true;
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	

	private Integer getClientId(WebSocketSession session) {
		// TODO Auto-generated method stub
		 //在线用户列表
	   Integer userId = (Integer) session.getAttributes().get("userId");
		return userId;
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		// TODO Auto-generated method stub
		
		
	
	}

	@Override
	protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
		// TODO Auto-generated method stub
		super.handlePongMessage(session, message);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(message.getPayload());
		
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		// TODO Auto-generated method stub
		super.handleTransportError(session, exception);
	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return super.supportsPartialMessages();
	}

	

}
