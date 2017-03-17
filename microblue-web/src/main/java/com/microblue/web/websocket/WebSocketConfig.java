package com.microblue.web.websocket;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

/**
 * websocket配置
 * 
 * @author liujiang
 *
 */
@Configuration
@EnableWebSocketMessageBroker
@EnableWebMvc
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry)
	{
		// 添加这个Endpoint，这样在网页中就可以通过websocket连接上服务了
		registry.addEndpoint("/websocket").withSockJS();
		System.out.println("registerStompEndpoints");
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config)
	{
		System.out.println("服务器启动成功");
		// 这里设置的simple broker是指可以订阅的地址，也就是服务器可以发送的地址
		config.enableSimpleBroker("/info", "/userChat", "/initChat", "/initFushionChart", "/updateChart", "/videoChat");
		config.setApplicationDestinationPrefixes("/app");
		System.out.println("configureMessageBroker");
	}

	@Override
	public void configureClientInboundChannel(ChannelRegistration channelRegistration)
	{
	}

	@Override
	public void configureClientOutboundChannel(ChannelRegistration channelRegistration)
	{
	}

	@Override
	public void configureWebSocketTransport(WebSocketTransportRegistration registry)
	{
		// TODO Auto-generated method stub
		System.out.println("registry:" + registry);
	}

	@Override
	public boolean configureMessageConverters(List<MessageConverter> messageConverters)
	{
		// TODO Auto-generated method stub
		System.out.println("messageConverters:" + messageConverters);
		return true;
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers)
	{
		// TODO Auto-generated method stub

	}
}
