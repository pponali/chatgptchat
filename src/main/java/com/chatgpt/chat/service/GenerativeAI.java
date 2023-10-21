package com.chatgpt.chat.service;

import com.chatgpt.chat.dto.AIModel;
import com.chatgpt.chat.dto.ChatGptRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

@Service
public class GenerativeAI {

    @Autowired
    AIModel aiModel;

    public String chatReponse(ChatGptRequest message) {
        // Implement the logic to generate code using the generative AI
        return aiModel.chatResponse(message);
    }
}
