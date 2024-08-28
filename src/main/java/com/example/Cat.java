package com.example;

import java.util.List;

public class Cat {


    Predator predator;

    public static final List<String> CATFOOD = List.of("Животные", "Птицы", "Рыба");

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
