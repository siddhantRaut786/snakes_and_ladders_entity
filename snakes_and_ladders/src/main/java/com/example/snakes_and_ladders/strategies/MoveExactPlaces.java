package com.example.snakes_and_ladders.strategies;

import com.example.snakes_and_ladders.models.Board;
import com.example.snakes_and_ladders.models.Button;
import com.example.snakes_and_ladders.models.ButtonStatus;
import com.example.snakes_and_ladders.models.MoveType;

public class MoveExactPlaces implements HandleMoveStrategy {
    @Override
    public void move(Board board, int value, Button button) {
        if(value<=board.getDimension()){
            button.setPosition(button.getPosition()+value);
            if(button.getPosition()==board.getDimension()){
                button.setButtonStatus(ButtonStatus.COMPLETED);
            }
        }
    }

    public MoveType getMoveType() {
        return MoveType.EXACT;
    }
}
