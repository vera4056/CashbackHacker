package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.junit.Test

    @Test

    public void boundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.boundary(amount);
        int expected = 700;
        assertEquals(expected, actual);


    }
    @Test

    public void upToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.boundary(amount);
        int expected = 300;
        assertEquals(expected, actual);


    }

}


