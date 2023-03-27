package com.ttpfx.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ttpfx
 * @date 2023/3/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGptMessage {
        String role;
        String content;
}
