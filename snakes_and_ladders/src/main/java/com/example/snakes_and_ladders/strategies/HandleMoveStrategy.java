package com.example.snakes_and_ladders.strategies;

import com.example.snakes_and_ladders.models.Board;
import com.example.snakes_and_ladders.models.Button;

public interface HandleMoveStrategy {
    public void move(Board board, int value, Button button);
}
