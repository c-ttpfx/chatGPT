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
public class ChatGptResponseParameter {

    String id;
    String object;
    String created;
    String model;
    Usage usage;
    List<Choices> choices;
}
