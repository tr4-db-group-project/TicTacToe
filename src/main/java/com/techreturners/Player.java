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

    public boolean checkWin() {
        int numberOfCountersInRow0 = 0;
        int numberOfCountersInRow1 = 0;
        int numberOfCountersInRow2 = 0;
        int numberOfCountersInCol0 = 0;
        int numberOfCountersInCol1 = 0;
        int numberOfCountersInCol2 = 0;
        int numberOfCountersInDiagLeft = 0;
        int numberOfCountersInDiagRight = 0;

        for(Position pos:playerPositions){
            int row = pos.rowNum();
            int col = pos.colNum();
            switch (row) {
                case 0:
                    numberOfCountersInRow0++;
                    break;
                case 1:
                    numberOfCountersInRow1++;
                    break;
                case 2:
                    numberOfCountersInRow2++;
                    break;
            }
            switch (col) {
                case 0:
                    numberOfCountersInCol0++;
                    break;
                case 1:
                    numberOfCountersInCol1++;
                    break;
                case 2:
                    numberOfCountersInCol2++;
                    break;
            }
            if(row==col) {
                numberOfCountersInDiagLeft++;
            }
            if((row==0 && col==2) || (row==1&&col==1)||(row==2&&col==0)) {
                numberOfCountersInDiagRight++;
            }
        }
        return numberOfCountersInCol0 == 3 || numberOfCountersInCol1 == 3 || numberOfCountersInCol2 == 3 ||
                numberOfCountersInRow0 == 3 || numberOfCountersInRow1 == 3 || numberOfCountersInRow2 == 3 ||
                numberOfCountersInDiagLeft == 3 || numberOfCountersInDiagRight == 3;
    }

}
