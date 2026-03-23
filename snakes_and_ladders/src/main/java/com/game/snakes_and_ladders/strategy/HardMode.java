package com.game.snakeandladder.strategy;

import com.game.snakeandladder.models.Player;

public class HardMode implements TurnStrategy {
    @Override
    public boolean canContinueTurn(Player player, int roll) {
        if (roll == 6) {
            if (player.getConsecutiveSixes() == 3) {
                // The 3rd consecutive 6 terminates the turn
                player.resetSixCount();
                return false;
            }
            return true; // 1st or 2nd 6 -> roll again
        }
        return false;
    }
}
