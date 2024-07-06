package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe ticTacToe;
    private Player playerOne;
    private Player playerTwo;

    @BeforeEach
    void setUp(){
        playerOne = new Player(new ArrayList<Position>());
        playerTwo = new Player(new ArrayList<Position>());
        ticTacToe = new TicTacToe(playerOne,playerTwo);
    }

    @Test
    void shouldReturnTrue_validatePositionInput() {
        assertTrue(ticTacToe.validatePositionInput(1,1));
        assertFalse(ticTacToe.validatePositionInput(1,3));
    }

    @Test
    void checkPositionPlayable() {
        List<Position> player1Positions = List.of(new Position(1,1),new Position(2,0),new Position(0,0));
        List<Position>player2Positions = List.of(new Position(0,1),new Position(2,1));
        ticTacToe.getPlayerOne().setPlayerPositions(player1Positions);
        ticTacToe.getPlayerTwo().setPlayerPositions(player2Positions);
        // playable position
        assertTrue(ticTacToe.checkPositionPlayable(1,2));
        //nonplayable position
        assertFalse(ticTacToe.checkPositionPlayable(1,1));
        assertFalse(ticTacToe.checkPositionPlayable(0,1));
    }
    @Test
    void savePlayer1Position() {
        List<Position> player1Positions = new ArrayList<>(List.of(new Position(1,1),new Position(2,0),new Position(0,0)));
        ticTacToe.getPlayerOne().setPlayerPositions(player1Positions);
        Position savePos = new Position(2,2);
        ticTacToe.savePlayer1Position(2,2);
        assertTrue(ticTacToe.getPlayerOne().getPlayerPositions().contains(savePos));
    }

}