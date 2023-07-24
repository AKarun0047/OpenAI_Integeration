package com.chatpt.OpenAiIntegeration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenAiService {
    @Value("${api_key}")
    // api key
    private String api_key;
    @Value("${modelid}")
    private String modelid;
    @Value("${url}")
    private String url ;
    private  final RestTemplate restTemplate;

    @Autowired
    public OpenAiService(RestTemplate restTemplate){
        this.restTemplate =restTemplate;
    }

public String OpenAiservicrcall(String userInput){
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.set("Authorization","Bearer" + api_key);
    String requestBody = "{\"model\": \"" + modelid + "\", \"message\": [{\"role\": \"user\", \"content\": \"" + userInput + "\"}]}";
    HttpEntity<String> request = new HttpEntity<>(requestBody,headers);
    String responsefromAi =  restTemplate.postForObject(url,request, String.class);
   return responsefromAi;


}


}
