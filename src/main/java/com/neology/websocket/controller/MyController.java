/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neology.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author km
 */
@Controller
public class MyController {
     @RequestMapping(value="/ping", method=RequestMethod.GET)
    @ResponseBody
    public String pong(){
        return "Kris pong";
    }
}
