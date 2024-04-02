package com.example.snakes_and_ladders.models;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Player {
    private UUID id;
    private List<Button> buttons;
    private Colour colour;
}
