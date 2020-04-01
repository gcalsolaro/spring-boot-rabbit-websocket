package com.gcalsolaro.rabbit.server.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rabbit")
public class RabbitController {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@GetMapping(value = "/send/{message}")
	public String send(@PathVariable("message") String message) {
		amqpTemplate.convertAndSend(message);
		return "Sent!";
	}

}
