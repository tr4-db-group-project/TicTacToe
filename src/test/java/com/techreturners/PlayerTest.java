package com.techreturners;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player(new ArrayList<>());
    }

    @Test
    void checkWin() {
        List<Position> losingPlayerPositions = List.of(new Position(0,0), new Position(0,1) , new Position(1,1));
        List<Position> winningPlayerPositions = List.of(new Position(0,0), new Position(0,1) , new Position(0,2));
        List<Position> winningDiagPlayerPositions = List.of(new Position(0,0), new Position(0,1) , new Position(1,1), new Position(2,2));
        List<Position> winningRightDiagPlayerPositions = List.of(new Position(1,1), new Position(2,0) , new Position(0,2), new Position(2,2));
        player.setPlayerPositions(losingPlayerPositions);
        assertFalse(player.checkWin());
        player.setPlayerPositions(winningPlayerPositions);
        assertTrue(player.checkWin());
        player.setPlayerPositions(winningDiagPlayerPositions);
        assertTrue(player.checkWin());
        player.setPlayerPositions(winningRightDiagPlayerPositions);
        assertTrue(player.checkWin());

    }
}