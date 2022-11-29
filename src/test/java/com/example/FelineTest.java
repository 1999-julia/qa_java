package com.example;

import org.junit.Test;


import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}
