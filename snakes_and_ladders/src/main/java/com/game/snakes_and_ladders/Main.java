package com.game.snakeandladder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Snake and Ladder Game...");
        // 10x10 board, 3 players, hard mode
        Game game = GameFactory.createGame(10, 3, "hard");
        game.startGame();
    }
}
