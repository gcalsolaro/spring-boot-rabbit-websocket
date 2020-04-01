package com.gcalsolaro.rabbit.client.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author Giuseppe
 *
 */
@Controller
public class WebSocketController {

	@MessageMapping("/stomp/broker")
	public String fakeEndpoint() throws Exception {
		return "Succesfull!";
	}
}
