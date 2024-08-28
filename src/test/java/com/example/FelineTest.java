package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {


    private final int kittenCount;

    public FelineTest(int kittenCount) {
        this.kittenCount = kittenCount;
    }

    @Parameterized.Parameters
    public static Object[][] kittens() {
        return new Object[][]{
                {1},
                {0},
                {3},
        };
    }

    @Test
    public void getKittensCheck() {
        Feline feline = new Feline();
        int actualQuantity = feline.getKittens(kittenCount);
        assertEquals("Неправильное количество котят", feline.getKittens(), actualQuantity);
    }


    @Test()
    public void eatMeatContainsFoodForPredators() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of(new String[]{"Животные", "Птицы", "Рыба"});
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void eatMeatHasTheCorrectSize() throws Exception {
        Feline feline = new Feline();
        List<String> actualFoodSize = feline.eatMeat();
        int expectedSize = 3;
        assertEquals(expectedSize, actualFoodSize.size());
    }


}
