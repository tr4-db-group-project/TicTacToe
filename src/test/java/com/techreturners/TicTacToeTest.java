package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp(){
        ticTacToe = new TicTacToe();
    }

    @Test
    void shouldReturnPlayer1Input_WhenGetPlayer1PositionCalledWith00(){
        int[] expectedOutput = new int[]{0,0};

        assertEquals(expectedOutput[0], ticTacToe.getPlayer1Position(0,0)[0]);
        assertEquals(expectedOutput[1], ticTacToe.getPlayer1Position(0,0)[1]);
    }


    @Test
    void shouldReturnTrue_validatePositionInput() {
        int[] validPlayerPos = new int[]{1,1};
        int[] inValidPlayerPos = new int[]{1,3};
        assertTrue(ticTacToe.validatePositionInput(validPlayerPos));
        assertFalse(ticTacToe.validatePositionInput(inValidPlayerPos));
    }

    @Test
    void savePlayer1Position() {
        int[] playerPos = new int[]{1,1};
        ticTacToe.savePlayer1Position(playerPos);
        assertArrayEquals(playerPos,ticTacToe.getPlayer1Positions()[0]);
    }

    @Test
    void checkPositionPlayable() {
        int[][] player1Positions = new int[][]{{1,1},{2,0},{0,0}};
        int[][] player2Positions = new int[][]{{0,1},{2,1}};
        ticTacToe.setPlayer1Positions(player1Positions);
        ticTacToe.setPlayer2Positions(player2Positions);
        int[] playerPos = new int[]{1,2};
        //assert
        assertTrue(ticTacToe.checkPositionPlayable(playerPos));

    }
}