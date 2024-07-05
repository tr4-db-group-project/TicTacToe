package com.techreturners;

import java.util.Arrays;
import java.util.stream.Stream;

public class TicTacToe {

    private int[][] player1Positions;
    private int[][] player2Positions;

    public int[][] getPlayer1Positions() {
        return player1Positions;
    }

    public void setPlayer1Positions(int[][] player1Positions) {
        this.player1Positions = player1Positions;
    }

    public int[][] getPlayer2Positions() {
        return player2Positions;
    }

    public void setPlayer2Positions(int[][] player2Positions) {
        this.player2Positions = player2Positions;
    }

    TicTacToe() {
        player1Positions = new int[9][];
        player1Positions = new int[9][];
    }


    public int[] getPlayer1Position(int row, int column) {
        int[] player1 = new int[]{row, column};
        return player1;
    }

    public boolean validatePositionInput(int[] playerPosition) {
        if (playerPosition[0] < 3 && playerPosition[1] < 3 && playerPosition[0] >= 0 && playerPosition[1] >= 0)
            return true;
        return false;
    }

    public boolean checkPositionPlayable(int[] playerPosition) {
//        if ((Arrays.stream(getPlayer1Positions()).toList().contains(playerPosition)) ||
//                (Arrays.stream(getPlayer2Positions()).toList().contains(playerPosition)))
//            return false;
//        else
//            return true;
        for(int i=0; i<player1Positions.length;i++) {
            if (Arrays.equals(Arrays.stream(player1Positions[i]).toArray(), playerPosition))
                return false;
        }
        for(int i=0; i<player2Positions.length;i++) {
            if (Arrays.equals(Arrays.stream(player2Positions[i]).toArray(), playerPosition))
                return false;
        }
        return  true;

    }

    public void savePlayer1Position(int[] playerPosition) {
        player1Positions[0] = playerPosition;

    }

}