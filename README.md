

# Spring Boot RabbitMQ WebSocket

![Java CI with Maven](https://github.com/gcalsolaro/spring-boot-rabbit-websocket/workflows/Java%20CI%20with%20Maven/badge.svg)
> **Sample application using Spring RabbitMQ as Message Broker and WebSocket**


## Table of Contents

   * [Spring Boot RabbitMQ WebSocket](#spring-boot-rabbitmq-websocket)
      * [Architecture](#architecture)
      * [Prerequisites](#prerequisites)
      * [Running Instructions](#running-instructions)
	      * [Installing RabbitMQ Server](#installing-rabbitmq-server)
	      * [Run Application](#run-application)
      * [Rest API](#rest-api)
	      * [Server API](#server-api)
      

## Architecture

The technology stack used is provided by Spring, in particular:

* **_Spring Boot_** - 2.1.1.RELEASE
* **_Spring Rabbit_** - 2.1.2.RELEASE
* **_Spring AMQP_** - 5.1.3.RELEASE
* **_Spring WebSocket_** - 5.1.3.RELEASE
* **_Reactor Netty_** - 0.8.3.RELEASE
* **_Freemarker_** - 2.3.28

## Prerequisites
* **_JDK 8_** - Install JDK 1.8 version
* **_Maven_** - Download latest version
* **_RabbiMQ Server_** - 3.8.3

## Running Instructions

### Installing RabbitMQ Server
- Download and install latest version of [RabbitMQServer](https://www.rabbitmq.com/)
- Enable Management console from shell

		rabbitmq-plugins enable rabbitmq_management

- Enable STOMP Endpoint installing plugin from shell:
		
		rabbitmq-plugins enable rabbitmq_stomp
		rabbitmq-plugins enable rabbitmq_web_stomp

### Run Application
- Start Client and Server Application
- Open Client web page [http://localhost:8083/rabbit](http://localhost:8083/rabbit)
- Invoke Server API

## Rest API

### Server API

Method | URI | Description | Parameters |
--- | --- | --- | --- |
`GET` | */rabbit/send/{message}* | Send an arbitrary message | message

