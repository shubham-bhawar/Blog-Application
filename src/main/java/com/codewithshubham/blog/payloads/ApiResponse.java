package com.codewithshubham.blog.payloads;

import lombok.*;

@Getter
@Setter
public class ApiResponse {

    private String message;
    private boolean success;

    public ApiResponse() {
    }

    public ApiResponse( String message,boolean success) {
        this.success = success;
        this.message = message;
    }
}
