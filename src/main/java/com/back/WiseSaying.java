package com.back;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class WiseSaying extends Object {
    private int id;
    private String content;
    private String author;
}
