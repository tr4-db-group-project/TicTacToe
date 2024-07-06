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
//
//    public int[] getPlayer1Position(int row, int column) {
//        int[] player1 = new int[]{row, column};
//        return player1;
//    }

    public boolean validatePositionInput(int rowNum, int colNum) {
        return (rowNum >= 0 && rowNum < 3 && colNum >= 0 && colNum < 3);
    }

    public boolean checkPositionPlayable(int rowNum, int colNum) {
//        if ((Arrays.stream(getPlayer1Positions()).toList().contains(playerPosition)) ||
//                (Arrays.stream(getPlayer2Positions()).toList().contains(playerPosition)))
//            return false;
//        else
//            return true;
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
//
//    public void savePlayer1Position(int[] playerPosition) {
//        player1Positions[player1Positions.length] = playerPosition;
//
//    }

}