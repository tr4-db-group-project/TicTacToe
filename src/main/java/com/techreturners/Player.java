package com.techreturners;

import java.util.List;

public class Player {
    private List<Position> playerPositions;

    public List<Position> getPlayerPositions() {
        return playerPositions;
    }

    public void setPlayerPositions(List<Position> playerPositions) {
        this.playerPositions = playerPositions;
    }

    public Player(List<Position> playerPositions) {
        this.playerPositions = playerPositions;
    }

    public void savePosition(Position p) {
        playerPositions.add(p);
    }

}
