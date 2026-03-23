package com.game.snakeandladder.models;

public class Player {
    private String id;
    private int position;
    private int consecutiveSixes;

    public Player(String id) {
        this.id = id;
        this.position = 0;
        this.consecutiveSixes = 0;
    }

    public void move(int steps) {
        this.position += steps;
    }

    public void resetSixCount() {
        this.consecutiveSixes = 0;
    }

    public void incrementSixes() {
        this.consecutiveSixes++;
    }

    public String getId() { return id; }
    public int getPosition() { return position; }
    public void setPosition(int position) { this.position = position; }
    public int getConsecutiveSixes() { return consecutiveSixes; }
}
