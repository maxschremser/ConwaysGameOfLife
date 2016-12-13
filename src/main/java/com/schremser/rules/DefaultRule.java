package com.schremser.rules;

import java.util.Arrays;

/**
 * Any live cell with fewer than 2 live neighbours dies (underpopulation)
 * Any live cell with 2 or 3 neighbours lives on
 * Any live cell with more than 3 live neighbours dies (overcrowding)
 * Any dead cell with exactly 3 (living) neighbours becomes live (reproduction)
 */
public class DefaultRule extends Rule {

    @Override
    public void evolve(boolean[][] board) {
        boolean[][] workBoard = new boolean[board.length][board[0].length];
        for (int column = 0; column < board.length; column++) {
            for (int row = 0; row < board[0].length; row++) {
                workBoard[column][row] = board[column][row];

                int neighbours = getNeighbours(board, column, row);
                // Any live cell with less than 2 live neighbours dies
                if (board[column][row] && neighbours < 2) {
                    workBoard[column][row] = false;
                }
                // Any live cell with 2 or 3 live neighbours stays alive
                if (board[column][row] && (neighbours == 2 || neighbours == 3)) {
                    workBoard[column][row] = true;
                }
                // Any live cells with more than 3 live neighbours dies
                if (board[column][row] && neighbours > 3) {
                    workBoard[column][row] = false;
                }
                // Any dead cell with 3 live neighbours becomes alive
                if (!board[column][row] && neighbours == 3) {
                    workBoard[column][row] = true;
                }
            }
        }
        for (int column = 0; column < board.length; column++) {
            for (int row = 0; row < board[0].length; row++) {
                board[column][row] = workBoard[column][row];
            }
        }
    }

    protected int getNeighbours(boolean[][] board, int column, int row) {
        // right neighbour
        int neighbours = 0;
        neighbours += getTopNeighbour(board, column, row) +
                getRightNeighbour(board, column, row) +
                getBottomNeighbour(board, column, row) +
                getLeftNeighbour(board, column, row);
        return neighbours;
    }

    protected int getTopNeighbour(boolean[][] board, int column, int row) {
        if (row > 0 && board[column].length > row && board[column][row-1]) {
            return 1;
        }
        return 0;
    }

    protected int getRightNeighbour(boolean[][] board, int column, int row) {
        if (column < (board.length -1) && board[column+1][row]) {
            return 1;
        }
        return 0;
    }

    protected int getBottomNeighbour(boolean[][] board, int column, int row) {
        if (row < (board[column].length - 1) && board[column][row+1]) {
            return 1;
        }
        return 0;
    }

    protected int getLeftNeighbour(boolean[][] board, int column, int row) {
        if (column > 0 && board[column-1][row]) {
            return 1;
        }
        return 0;
    }

}
