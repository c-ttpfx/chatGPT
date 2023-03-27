package com.ttpfx.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ttpfx
 * @date 2023/3/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Choices {

    ChatGptMessage message;
    String finish_reason;
    Integer index;
}
