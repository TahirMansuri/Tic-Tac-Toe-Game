package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
    //Playing Board Array for Locations
    private static char[] playingBoard = new char[10];
    private static char playingSybmol;

    //UC 1 Method for initializing board position
    private static void initializeBoard() {
        for(int i = 1; i < 10; i++) {
            playingBoard[i] = '_';
        }
    }

    //UC 3 Showing the Board Elements
    private static void showBoard() {
        for (int i = 1; i < 10; i++) {
            if ((i) % 3 == 0) {
                System.out.println(playingBoard[i]);
                if (i != 10 - 1) {
                    System.out.println("-----");
                }
            } else {
                System.out.print(playingBoard[i] + "|");
            }
        }
    }

    //UC 2 Method for setting Input Symbol for User
    private static void setPlayingSymbol() {
        while(playingSybmol != 'X' && playingSybmol != 'O') {
            System.out.println("Please Select the Symbol for Play: X or O");
            //Scanner Method for User Input
            Scanner sc = new Scanner(System.in);
            playingSybmol = sc.next().charAt(0);
            switch (playingSybmol) {
                case 'X':
                    System.out.println("Player Selected " + playingSybmol + " Symbol");
                    break;
                case 'O':
                    System.out.println("Player Selected " + playingSybmol + " Symbol");
                    break;
                default:
                    System.out.println("Please Select the Symbol From X or O only");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        //Tic Tac Toe Game Development
        System.out.println("Welcome to Tic Tac Toe Game Simulator.");

        //Initializing the Playing Board boxes
        initializeBoard();

        //Setting the Symbol for Play
        setPlayingSymbol();

        showBoard();
    }
}
