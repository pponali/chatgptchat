package com.chatgpt.chat.dto;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGptRequest {

    private String model;
    private List<Message> messages;

    public ChatGptRequest(String model, String prompt) {
        this.model = model;

        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}