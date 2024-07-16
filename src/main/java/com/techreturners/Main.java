package com.techreturners;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Lets Play Tic Tac Toe");
        TicTacToe ticTacToe = new TicTacToe(new Player(new ArrayList<>()), new Player(new ArrayList<>()));
        boolean play = true;
        System.out.println(ticTacToe.generateDisplayGrid());
        while (play) {
            while (play) {
                System.out.println("Player1: enter row (0-2) and column(0-2)  for your move");
                Scanner scanner = new Scanner(System.in);
                try {
                    int row = Integer.parseInt(scanner.next());
                    int col = Integer.parseInt(scanner.next());


                    if (ticTacToe.validatePositionInput(row, col)) {
                        if (ticTacToe.checkPositionPlayable(row, col)) {
                            ticTacToe.savePlayer1Position(row, col);
                            System.out.println(ticTacToe.generateDisplayGrid());
                            play = !ticTacToe.getPlayerOne().checkWin();
                            if (!play)
                                System.out.println("Player1 Wins this round");
                            break;
                        } else {
                            System.out.println("That position is occupied choose a different position");
                        }
                    }
                    else{
                    System.out.println(("Invalid row and column number!!"));
                }
                }catch(NumberFormatException e){
                    System.out.println(("Invalid number"));
                }
            }
            while (play) {
                System.out.println("Player2: enter row (0-2) and column(0-2)  for your move");
                Scanner scanner = new Scanner(System.in);
                try {
                    int row = Integer.parseInt(scanner.next());
                    int col = Integer.parseInt(scanner.next());

                    if (ticTacToe.validatePositionInput(row, col)) {
                        if (ticTacToe.checkPositionPlayable(row, col)) {
                            ticTacToe.savePlayer2Position(row, col);
                            System.out.println(ticTacToe.generateDisplayGrid());
                            play = !ticTacToe.getPlayerTwo().checkWin();
                            if (!play)
                                System.out.println("Player2 Wins this round");
                            break;
                        } else {
                            System.out.println("That position is occupied choose a different position");
                        }
                    } else {
                        System.out.println(("Invalid row and column number!!"));
                    }
                }catch(NumberFormatException e){
                    System.out.println(("Invalid number"));
                }

            }

        }



    }
}