package com.sds.ap.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestResponse {
    private boolean result;
    private String originText;
    private String changeText;

}
