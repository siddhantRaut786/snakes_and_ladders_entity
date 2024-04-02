package com.example.snakes_and_ladders.models;

import lombok.Data;

@Data
public class Dice {
    private int maxNumber;
    public int roll() {
        return (int) (Math.random() * (6-1) + 1);
    }
}
