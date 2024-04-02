package com.example.snakes_and_ladders.models;

import lombok.Data;

@Data
public abstract class ForeignEntity {
    private int from;
    private int to;
    private ForeignEntityType foreignEntityType;
}
