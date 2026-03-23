package com.game.snakeandladder.strategy;

import com.game.snakeandladder.models.Player;

public class EasyMode implements TurnStrategy {
    @Override
    public boolean canContinueTurn(Player player, int roll) {
        return roll == 6; // Keep going indefinitely on a 6
    }
}
