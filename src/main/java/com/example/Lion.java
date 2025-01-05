package com.example;

import java.util.List;

public class Lion {

    Predator predator;

    public Lion(Feline feline) {
        this.predator = feline;
    }


    boolean hasMane;


    Feline f = new Feline(predator);

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return f.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return f.eatMeat();
    }

}