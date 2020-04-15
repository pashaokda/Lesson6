package com.company;

public class Advice extends Thought{

    @Override
    public void message() {

        System.out.println("Advice.message");
        super.message();
    }
}
