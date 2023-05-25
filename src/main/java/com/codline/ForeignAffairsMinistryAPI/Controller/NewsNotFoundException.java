package com.codline.ForeignAffairsMinistryAPI.Controller;

public class NewsNotFoundException extends RuntimeException {

    public NewsNotFoundException(String message) {
        super(message);
    }

}
