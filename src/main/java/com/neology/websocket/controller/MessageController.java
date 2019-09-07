/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.websocket.controller;

import com.neology.websocket.model.Greeting;
import com.neology.websocket.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 *
 * @author km
 */
@Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting sendMessage(HelloMessage message) {
        System.out.println("Comming "+message.getName());
       // return new Greeting("New message ! " +HtmlUtils.htmlEscape(message.getName()) + "!" );
       return new Greeting("New message ! " + message.getName() + "!" );
    }
}
