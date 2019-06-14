package com.company.learning.learning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloResponse {

    @JsonProperty("message")
    private String message;

    @JsonCreator
    public HelloResponse(String message) {
        this.message = message;
    }

    public String GetMessage() {
        return message;
    }
}
