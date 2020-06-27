package com.example.useglovalvariablesampleapp;

import android.app.Application;

public class Myapp extends Application {
    private String testString = "defaul";

    public void onCreate(){
        super.onCreate();
    }

    public String getTestString(){
        return testString;
    }

    public void setTestString(String str){
        testString = str;
    }


}
