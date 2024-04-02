package com.example.snakes_and_ladders.strategies;

import com.example.snakes_and_ladders.models.StartType;

public class StartWithSix implements CanStartStrategy {

    @Override
    public boolean canUnlock(int value) {
        return value == 6;
    }

    public StartType getStartType() {
        return StartType.SIX;
    }
}
