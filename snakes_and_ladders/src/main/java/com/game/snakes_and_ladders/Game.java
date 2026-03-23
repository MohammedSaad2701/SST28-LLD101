package com.game.snakeandladder;

import com.game.snakeandladder.models.Board;
import com.game.snakeandladder.models.Dice;
import com.game.snakeandladder.models.Player;
import com.game.snakeandladder.models.Jump;
import com.game.snakeandladder.models.Snake;
import com.game.snakeandladder.models.Ladder;
import com.game.snakeandladder.strategy.TurnStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;
    private Dice dice;
    private TurnStrategy strategy;
    private List<Player> winners;
    private int target;

    public Game(Board board, Queue<Player> players, Dice dice, TurnStrategy strategy) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.strategy = strategy;
        this.winners = new ArrayList<>();
        this.target = board.getSize() * board.getSize();
    }

    public void startGame() {
        System.out.println("Board configuration:");
        board.printBoard();
        System.out.println("\nStarting Game...");
        while (players.size() >= 2) {
            Player currentPlayer = players.poll();
            playTurn(currentPlayer);
        }
        System.out.println("Game Over! Winners are:");
        for(int i = 0; i < winners.size(); i++) {
            System.out.println((i+1) + ". " + winners.get(i).getId());
        }
    }

    public void playTurn(Player player) {
        System.out.println("\n--- " + player.getId() + "'s turn ---");
        boolean canContinue;
        do {
            int roll = dice.roll();
            System.out.println(player.getId() + " rolled a " + roll);

            if (roll == 6) {
                player.incrementSixes();
            } else {
                player.resetSixCount();
            }

            canContinue = strategy.canContinueTurn(player, roll);

            int newPos = player.getPosition() + roll;

            if (newPos > target) {
                System.out.println("Roll exceeds target. Cannot move.");
            } else {
                Jump jump = board.getJump(newPos);
                if (jump != null) {
                    if (jump instanceof Snake) {
                        System.out.println(player.getId() + " got bitten by a snake at " + jump.getStart() + " and fell to " + jump.getEnd() + "!");
                    } else if (jump instanceof Ladder) {
                        System.out.println(player.getId() + " climbed a ladder from " + jump.getStart() + " to " + jump.getEnd() + "!");
                    }
                    newPos = jump.getEnd();
                }
                player.setPosition(newPos);
                System.out.println(player.getId() + " moved to " + newPos);

                if (newPos == target) {
                    System.out.println(player.getId() + " wins!");
                    winners.add(player);
                    break; 
                }
            }
        } while (canContinue);

        if (player.getPosition() < target) {
            players.offer(player);
        }
    }

    public boolean isGameOver() {
        return players.size() < 2;
    }
}
