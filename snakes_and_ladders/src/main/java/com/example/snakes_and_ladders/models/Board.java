package com.example.snakes_and_ladders.models;

import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Data
public class Board {
    public int getDimension() {
        return dimension;
    }

    private int dimension;
    private Map<Integer, ForeignEntity> map;
}
