package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private String whatkindofmood;
    private Date thedate;
    public Date getTheDate() {
        return thedate;
    }

    public void setTheDate(Date theDate) {
        this.thedate = theDate;
    }


    public Mood(){
        this.thedate = new Date();
    }

    public Mood(Date theDate){
        this.thedate = theDate;
    }

    public abstract String Moodvalue();

}
