package com.gcalsolaro.rabbit.client.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class SpringAMQPRabbitAsyncListener implements MessageListener {

	private transient final Logger logger = LoggerFactory.getLogger(SpringAMQPRabbitAsyncListener.class);

	@Override
	public void onMessage(Message message) {
		logger.info("Listener received message = " + new String(message.getBody()));
	}

}
