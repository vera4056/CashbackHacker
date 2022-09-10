package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.junit.Test

    @Test

    public void boundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.boundary(amount);
        int expected = 0;
        assertEquals(expected, actual);


    }

    @org.junit.Test
    @Test


    public void upToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.boundary(amount);
        int expected = 700;
        assertEquals(expected, actual);


    }

}


