package com.techreturners;

import java.util.ArrayList;

public class TicTacToe {

    private Player playerOne;
    private Player playerTwo;

    public TicTacToe(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public TicTacToe() {
        playerOne = new Player(new ArrayList<>());
        playerTwo = new Player(new ArrayList<>());
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public boolean validatePositionInput(int rowNum, int colNum) {
        return (rowNum >= 0 && rowNum < 3 && colNum >= 0 && colNum < 3);
    }

    public boolean checkPositionPlayable(int rowNum, int colNum) {
        for (Position pos : playerOne.getPlayerPositions()) {
            if ((pos.rowNum() == rowNum) && (pos.colNum() == colNum)) {
                return false;
            }
        }

        for (Position pos : playerTwo.getPlayerPositions()) {
            if ((pos.rowNum() == rowNum) && (pos.colNum() == colNum)) {
                return false;
            }
        }
        return true;
    }

    public void savePlayer1Position(int rowNum, int colNum) {
        playerOne.savePosition(new Position(rowNum,colNum));
    }

    public void savePlayer2Position(int rowNum, int colNum) {
        playerTwo.savePosition(new Position(rowNum,colNum));
    }

    public String generateDisplayGrid() {
        char[][] gridOutput = new char[3][3];
        StringBuilder output = new StringBuilder();
        for(Position pos :playerOne.getPlayerPositions()) {
            gridOutput[pos.rowNum()][pos.colNum()]='X';
        }
        for(Position pos:playerTwo.getPlayerPositions()) {
            gridOutput[pos.rowNum()][pos.colNum()]='O';
        }

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (gridOutput[i][j] == '\u0000')
                    output.append(" ");
                else
                    output.append(gridOutput[i][j]);
                output.append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }

}