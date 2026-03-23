package com.game.snakeandladder.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Board {
    private int size;
    private Map<Integer, Jump> jumps;
    private Set<Integer> occupiedCells;

    public Board(int n) {
        this.size = n;
        this.jumps = new HashMap<>();
        this.occupiedCells = new HashSet<>();
    }

    public void placeSnakes(int n) {
        Random random = new Random();
        int count = 0;
        int maxCell = size * size;
        while(count < n) {
            int head = random.nextInt(maxCell - 2) + 2; // Head between 2 and maxCell-1
            int tail = random.nextInt(head - 1) + 1;    // Tail strictly less than head

            if (!occupiedCells.contains(head) && !occupiedCells.contains(tail)) {
                jumps.put(head, new Snake(head, tail));
                occupiedCells.add(head);
                occupiedCells.add(tail);
                count++;
            }
        }
    }

    public void placeLadders(int n) {
        Random random = new Random();
        int count = 0;
        int maxCell = size * size;
        while(count < n) {
            int start = random.nextInt(maxCell - 2) + 2; 
            int end = random.nextInt(maxCell - start) + start + 1; 

            if (!occupiedCells.contains(start) && !occupiedCells.contains(end)) {
                jumps.put(start, new Ladder(start, end));
                occupiedCells.add(start);
                occupiedCells.add(end);
                count++;
            }
        }
    }

    public Jump getJump(int pos) {
        return jumps.get(pos);
    }

    public void printBoard() {
        for (Map.Entry<Integer, Jump> entry : jumps.entrySet()) {
            Jump jump = entry.getValue();
            if (jump instanceof Snake) {
                System.out.println("Snake from " + jump.getStart() + " to " + jump.getEnd());
            } else if (jump instanceof Ladder) {
                System.out.println("Ladder from " + jump.getStart() + " to " + jump.getEnd());
            }
        }
    }

    public int getSize() {
        return size;
    }
}
