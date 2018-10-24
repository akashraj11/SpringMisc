package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String message = "abcd";
    public String getMessage(){
        return message;
    }

    public void setMessage(){
        this.message = message;
    }

}
