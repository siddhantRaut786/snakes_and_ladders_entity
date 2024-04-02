package com.example.snakes_and_ladders.factories;

import com.example.snakes_and_ladders.models.MoveType;
import com.example.snakes_and_ladders.strategies.HandleMoveStrategy;
import com.example.snakes_and_ladders.strategies.MoveExactPlaces;
import com.example.snakes_and_ladders.strategies.MoveToTheExtent;

import java.util.HashMap;
import java.util.Map;

public class HandleMoveStrategyFactory {
    public HandleMoveStrategyFactory() {
        this.registry = new HashMap<>();
        registry.put(MoveType.BEYOND, new MoveToTheExtent());
        registry.put(MoveType.EXACT, new MoveExactPlaces());
    }

    public Map<MoveType, HandleMoveStrategy> registry;

    public HandleMoveStrategy getHandleMoveStrategy(MoveType moveType) {
        return registry.get(moveType);
    }
}
