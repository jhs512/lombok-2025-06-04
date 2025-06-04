package com.back;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class WiseSaying extends Object {
    private final int id;
    private final String content;
    private String author;
}
