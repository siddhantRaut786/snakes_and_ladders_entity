package com.example.snakes_and_ladders.strategies;

import com.example.snakes_and_ladders.models.StartType;

public class StartWithOne implements CanStartStrategy{
    @Override
    public boolean canUnlock(int value) {
        return value == 1;
    }

    public StartType getStartType() {
        return StartType.ONE;
    }
}
