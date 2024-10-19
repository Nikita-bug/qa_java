package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getFoodCheckForTheLion() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Cat.CATFOOD);
        List<String> expectedFood = Cat.CATFOOD;
        assertEquals(expectedFood, lion.getFood());
    }


    @Test
    public void doesHaveManeCheckFem() throws Exception {
        Lion lion = new Lion("Самка");
        assertNotEquals(lion.doesHaveMane(), true);
    }

    @Test
    public void doesHaveManeCheckMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertNotEquals(lion.doesHaveMane(), false);
    }

    @Test(expected = Throwable.class)
    public void checkLionSexException() throws Exception  {
        Lion lion = new Lion("Неизвестный");
    }

    @Test
    public void checkKittens(){
        Lion lion = new Lion(feline);
        int expectedKittenCount = 2;
        Assert.assertEquals(expectedKittenCount, lion.getKittens());
    }

}
