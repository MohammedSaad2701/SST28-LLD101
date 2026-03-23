package com.game.snakeandladder.strategy;

import com.game.snakeandladder.models.Player;

public interface TurnStrategy {
    boolean canContinueTurn(Player player, int roll);
}
