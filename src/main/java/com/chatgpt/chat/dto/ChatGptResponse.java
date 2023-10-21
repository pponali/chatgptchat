package com.chatgpt.chat.dto;

import lombok.Data;

import java.util.List;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

@Data
public class ChatGptResponse {

    private List<Choice> choices;

}
