package com.techreturners;

public class TicTacToe {

    private Player playerOne;
    private Player playerTwo;

    public TicTacToe(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
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
        playerOne.getPlayerPositions().add(new Position(rowNum,colNum));
    }

}