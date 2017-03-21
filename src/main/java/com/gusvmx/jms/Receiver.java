package com.gusvmx.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.gus.protobuf.model.MyModelProtos.Person;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Person person) {
    	System.out.println("Nombre de la persona recibida: " + person.getName());
    	System.out.println("EMail de la persona recibida: " + person.getEmail());
    }

}

