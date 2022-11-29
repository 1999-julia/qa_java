package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    Feline feline;
    private final String gender;
    private final boolean expectedResult;

    public LionParameterizedTest(String gender, boolean expectedResult) {
        this.gender = gender;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "gender = {0}, expectedResult = {1}}")
    public static Object[][] getGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(gender, feline);
        assertEquals(expectedResult, lion.hasMane);
    }
}
