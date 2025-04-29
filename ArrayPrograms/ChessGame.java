package com.Suraj.ArrayPrograms;

import java.util.Scanner;

public class ChessGame {
    private static final int SIZE = 8;
    private char[][] board;

    public ChessGame() {
        board = new char[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        String initialSetup = "RNBQKBNRPPPPPPPP                                pppppppprnbqkbnr";
        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = initialSetup.charAt(index++);
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] == ' ' ? '.' : board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean movePiece(int fromX, int fromY, int toX, int toY) {
        if (isValidMove(fromX, fromY, toX, toY)) {
            board[toX][toY] = board[fromX][fromY];
            board[fromX][fromY] = ' ';
            return true;
        }
        return false;
    }

    private boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= SIZE || fromY < 0 || fromY >= SIZE || toX < 0 || toX >= SIZE || toY < 0 || toY >= SIZE) {
            return false;
        }
        return board[fromX][fromY] != ' ';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessGame game = new ChessGame();

        while (true) {
            game.displayBoard();
            System.out.print("Enter move (e.g., 1 0 3 0 for moving a piece from row 1, col 0 to row 3, col 0): ");
            int fromX = scanner.nextInt();
            int fromY = scanner.nextInt();
            int toX = scanner.nextInt();
            int toY = scanner.nextInt();

            if (!game.movePiece(fromX, fromY, toX, toY)) {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}
