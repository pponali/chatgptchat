package com.chatgpt.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author prakashponali
 * @Date 21/10/23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    private int index;
    private Message message;

}
