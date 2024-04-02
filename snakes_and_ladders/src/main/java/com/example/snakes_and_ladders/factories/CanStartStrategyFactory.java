package com.example.snakes_and_ladders.factories;

import com.example.snakes_and_ladders.models.StartType;
import com.example.snakes_and_ladders.strategies.CanStartStrategy;
import com.example.snakes_and_ladders.strategies.StartWithOne;
import com.example.snakes_and_ladders.strategies.StartWithSix;

import java.util.HashMap;
import java.util.Map;

public class CanStartStrategyFactory {
    public CanStartStrategyFactory() {
        this.registry = new HashMap<>();
        registry.put(StartType.ONE, new StartWithOne());
        registry.put(StartType.SIX, new StartWithSix());
    }

    public Map<StartType, CanStartStrategy> registry;

    public CanStartStrategy getCanStartStrategy(StartType startType) {
        return registry.get(startType);
    }
}
