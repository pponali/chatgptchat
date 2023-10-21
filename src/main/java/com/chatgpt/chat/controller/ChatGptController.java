package com.chatgpt.chat.controller;

import com.chatgpt.chat.dto.ChatGptRequest;
import com.chatgpt.chat.service.GenerativeAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author prakashponali
 * @Date 21/10/23
 */
@RestController
@RequestMapping("/message")
public class ChatGptController {

    @Autowired
    GenerativeAI generativeAI;

    @Value("${chatgpt.model}")
    String model;


    @Value("${chatgpt.url}")
    private String apiUrl;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        ChatGptRequest request = new ChatGptRequest(model, prompt);

        return generativeAI.chatReponse(request);
    }
}
