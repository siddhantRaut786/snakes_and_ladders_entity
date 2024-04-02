package com.example.snakes_and_ladders.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Game {
    private Board board;
    private Dice dice;
    private List<Player> players;
    private int buttonsPerPlayer;
    private GameStatus gameStatus;
    private List<Player> ranking;

    private Game(Board board, Dice dice, List<Player> players, int buttonsPerPlayer, GameStatus gameStatus, List<Player> ranking, int lastPlayerMovedIndex) {
        this.board = board;
        this.dice = dice;
        this.players = players;
        this.buttonsPerPlayer = buttonsPerPlayer;
        this.gameStatus = gameStatus;
        this.ranking = ranking;
        this.lastPlayerMovedIndex = lastPlayerMovedIndex;
    }

    private int lastPlayerMovedIndex;

    public Board getBoard() {
        return board;
    }

    public Dice getDice() {
        return dice;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getButtonsPerPlayer() {
        return buttonsPerPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Player> getRanking() {
        return ranking;
    }

    static class Builder {
        private Board board;
        private Dice dice;
        private List<Player> players;
        private int buttonsPerPlayer;
        private GameStatus gameStatus;
        private List<Player> ranking;
        private int lastPlayerMovedIndex;

        public Builder board(Board board) {
            this.board = board;
            return this;
        }
        public Builder dice(Dice dice) {
            this.dice = dice;
            return this;
        }
        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder buttonsPerPlayer(int buttonsPerPlayer) {
            this.buttonsPerPlayer = buttonsPerPlayer;
            return this;
        }
        public Builder gameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }
        public Builder ranking(List<Player> ranking) {
            this.ranking = ranking;
            return this;
        }
        public Builder lastPlayerMovedIndex(int lastPlayerMovedIndex) {
            this.lastPlayerMovedIndex = lastPlayerMovedIndex;
            return this;
        }
        public Game build(){
            return new Game(board, dice, players, buttonsPerPlayer, gameStatus, ranking, lastPlayerMovedIndex);
        }
    }
}
