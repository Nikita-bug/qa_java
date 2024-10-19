package com.example;

import java.util.List;

public class Lion implements Kittens{

    boolean hasMane;
    private Feline feline;



    public Lion(Feline feline) {
        this.feline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }


    @Override
    public int getKittens() {
        return getKittens(2);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
