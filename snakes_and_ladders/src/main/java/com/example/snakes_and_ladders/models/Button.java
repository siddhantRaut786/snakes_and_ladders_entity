package com.example.snakes_and_ladders.models;

import lombok.Data;

@Data
public class Button {
    private int position;
    private ButtonStatus buttonStatus;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ButtonStatus getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(ButtonStatus buttonStatus) {
        this.buttonStatus = buttonStatus;
    }
}
