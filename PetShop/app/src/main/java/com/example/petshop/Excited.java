package com.example.petshop;

import java.util.Date;

public class Excited extends Mood{
    public Excited(Date thedate) {
        super(thedate);
    }
    public Excited(){
        super();
    }
    @Override
    public String Moodvalue() {
        return "Excited";
    }
}
