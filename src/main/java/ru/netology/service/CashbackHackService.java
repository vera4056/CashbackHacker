package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

    public int boundary(int amount) {
        if (amount < 1000) {
            int i = boundary - amount;
            return i;
        }
        return 0;
    }
}
