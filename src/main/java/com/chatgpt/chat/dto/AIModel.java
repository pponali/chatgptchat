package com.chatgpt.chat.dto;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * This class represents the AI model used for generating code.
 */

@Component
public class AIModel {

    @Autowired
    private RestTemplate restTemplate;


    @Value("${chatgpt.url}")
    private String chatgptUrl;


    public String chatResponse(ChatGptRequest request){

        ChatGptResponse response = restTemplate.postForObject(chatgptUrl, request, ChatGptResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }
        return response.getChoices().get(0).getMessage().getContent();
    }
}
