package com.senac.ThallesNascimentoEmissorMS.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VooProducer {

    private RabbitTemplate rmqTemplate;

    public VooProducer(RabbitTemplate rmqTemplate) {
        this.rmqTemplate = rmqTemplate;
    }

    @Value(value = "{broker.queue.voo.name}")
    private String routingKey;

    public void publishMessageListVoos(){
        String voo = "Retorne o voo";
        rmqTemplate.convertAndSend("", routingKey, voo);
    }
}
