package com.microservice.consumer.eventhandler;

import com.microservice.consumer.model.AccountOpenedEvent;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AccountOpenedHandler {


    @RabbitListener(queues = "${consumer.queuename}")
    public void getMessage(final AccountOpenedEvent accountOpenedEvent) {
        System.out.println(" account number received:" + accountOpenedEvent.getAccountNumber());
    }
}

