package com.example.petshop;

import java.util.Date;

public class Grateful extends Mood{
    public Grateful(Date thedate) {
        super(thedate);
    }
    public Grateful(){
        super();
    }
    @Override
    public String Moodvalue() {
        return "Grateful";
    }
}
