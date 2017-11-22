package com.arkaces.aces_api_server_lib.error;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NotFoundException extends RuntimeException {

    private String code;
    private String message;

    public NotFoundException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

}
