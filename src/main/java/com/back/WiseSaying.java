package com.back;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WiseSaying extends Object {
    private int id;
    private String content;
    private String author;
}
