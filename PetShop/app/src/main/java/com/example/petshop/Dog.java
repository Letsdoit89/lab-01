package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name) {

        super(name);
    }

    public Dog(String name, Date birthDate){
        //super(name);
        super(name,birthDate);
    }
    @Override
    public void pet(){
        return;
    }
    @Override
    public String speak() {
        return "bark";
    }

}
