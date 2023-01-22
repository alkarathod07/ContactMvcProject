package com.rahul.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties("app1")
@Configuration
public class AppProps {
	
	
	
	private Map<String, String> messages= new HashMap<>();

	
	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}

	public AppProps(Map<String, String> messages) {
		super();
		this.messages = messages;
	}
	


	
}
