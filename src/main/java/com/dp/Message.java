package com.dp;

import java.util.Map;

public class Message {

    public String content; 

    public String date;

    public Map<String, String> environment;

    public Message(String content, String date) {
        this.content = content;
        this.date = date;
        this.environment = System.getenv();
    }
}