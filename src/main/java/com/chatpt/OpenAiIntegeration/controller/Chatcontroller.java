package com.chatpt.OpenAiIntegeration.controller;

import com.chatpt.OpenAiIntegeration.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Chatcontroller {

    @Autowired
    OpenAiService aiService;
    @GetMapping("/chat")
    public String callingApi(@RequestParam("userInput") String UserInput){
        String response = aiService.OpenAiservicrcall(UserInput);
        return response;


    }





}
