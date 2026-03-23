package com.game.snakeandladder;

import com.game.snakeandladder.models.Board;
import com.game.snakeandladder.models.Dice;
import com.game.snakeandladder.models.Player;
import com.game.snakeandladder.strategy.EasyMode;
import com.game.snakeandladder.strategy.HardMode;
import com.game.snakeandladder.strategy.TurnStrategy;

import java.util.LinkedList;
import java.util.Queue;

public class GameFactory {
    public static Game createGame(int n, int numPlayers, String mode) {
        Board board = new Board(n);
        board.placeSnakes(n);
        board.placeLadders(n);

        Queue<Player> players = new LinkedList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.offer(new Player("Player " + i));
        }

        Dice dice = new Dice();
        TurnStrategy strategy;
        
        if (mode.equalsIgnoreCase("easy")) {
            strategy = new EasyMode();
        } else {
            strategy = new HardMode();
        }

        return new Game(board, players, dice, strategy);
    }
}
