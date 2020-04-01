package com.gcalsolaro.rabbit.client.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gcalsolaro.rabbit.client.listener.SpringAMQPRabbitAsyncListener;

@Configuration
public class RabbitMQConfig {

	@Value("${example.rabbitmq.queue}")
	private String queueName;

	@Bean
	public Queue queue() {
		return new Queue(queueName, true);
	}

	@Bean
	public MessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory) {
		SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
		simpleMessageListenerContainer.setConnectionFactory(connectionFactory);
		simpleMessageListenerContainer.setQueues(queue());
		simpleMessageListenerContainer.setMessageListener(new SpringAMQPRabbitAsyncListener());
		return simpleMessageListenerContainer;
	}

}
