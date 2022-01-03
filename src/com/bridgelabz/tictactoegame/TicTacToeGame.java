package com.bridgelabz.tictactoegame;

public class TicTacToeGame {

    private static char[] playingBoard = new char[10];

    private static void initializeBoard() {
        for(int i=1; i<10; i++) {
            playingBoard[i]=' ';
        }
    }

    public static void main(String[] args) {

        //Tic Tac Toe Game Development
        System.out.println("Welcome to Tic Tac Toe Game Simulator.");

        //Initializing the Playing Board boxes
        initializeBoard();
    }
}
