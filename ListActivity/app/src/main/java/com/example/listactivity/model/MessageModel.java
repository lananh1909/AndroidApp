package com.example.listactivity.model;

import android.graphics.Color;

import java.util.Random;

public class MessageModel {
    int avartarResource;
    String username;
    String message;

    public MessageModel(int avartarResource, String username, String message) {
        this.avartarResource = avartarResource;
        this.username = username;
        this.message = message;

    }

    public int getAvartarResource() {
        return avartarResource;
    }

    public void setAvartarResource(int avartarResource) {
        this.avartarResource = avartarResource;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
