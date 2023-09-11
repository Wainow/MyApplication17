package com.example.mylibrary;

public class Interactor {
    public int getVar() {
        var number = 5;
        number++;
        return number;
    }

    public String getData() {
        return new MyData("", "asf").a();
    }
}
