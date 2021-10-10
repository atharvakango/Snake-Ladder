package snakeLadder;

import java.util.*;

public class Board {
    Map<Integer, Integer> snake;
    Map<Integer, Integer> ladder;
    int size;
    
    
    public Board(Map<Integer, Integer> snake, Map<Integer, Integer> ladder, int size) {
        this.snake = snake;
        this.ladder = ladder;
        this.size = size;
    }

    public Map<Integer, Integer> getSnake() {
        return snake;
    }
    public void setSnake(Map<Integer, Integer> snake) {
        this.snake = snake;
    }
    public Map<Integer, Integer> getLadder() {
        return ladder;
    }
    public void setLadder(Map<Integer, Integer> ladder) {
        this.ladder = ladder;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

}
