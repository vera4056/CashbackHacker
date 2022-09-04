package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test

    public void testWithBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.boundary(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test

    public void testUpToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.boundary(amount);
        int expected = 300;
        assertEquals(actual, expected);

    }
}

