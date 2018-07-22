package com.socket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class MywebsocketConfig implements WebSocketConfigurer{

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("进入myhandler");
	registry.addHandler(myHandler(), "/myHandler").addInterceptors(new Myinterceptor());
	System.out.println("退出myhandler");
	}
	
	@Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }
	

}
