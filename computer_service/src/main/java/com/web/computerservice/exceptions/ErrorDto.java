package com.web.computerservice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDto extends Exception {

    private String message;

    public ErrorDto() {
        super();
    }

    public ErrorDto(String message) {
        super(message);
    }
}
