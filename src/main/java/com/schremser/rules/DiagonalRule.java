package com.schremser.rules;

/**
 * Any live cell with fewer than 2 live neighbours dies (underpopulation)
 * Any live cell with 2 or 3 neighbours lives on
 * Any live cell with more than 3 live neighbours dies (overcrowding)
 * Any dead cell with exactly 3 (living) neighbours becomes live (reproduction)
 */
public class DiagonalRule extends DefaultRule {

    protected int getNeighbours(boolean[][] board, int column, int row) {
        // right neighbour
        int neighbours = 0;
        neighbours += getTopNeighbour(board, column, row) +
                getTopRightNeighbour(board, column, row) +
                getRightNeighbour(board, column, row) +
                getBottomRightNeighbour(board, column, row) +
                getBottomNeighbour(board, column, row) +
                getBottomLeftNeighbour(board, column, row) +
                getLeftNeighbour(board, column, row) +
                getLeftTopNeighbour(board, column, row);
        return neighbours;
    }

    private int getTopRightNeighbour(boolean[][] board, int column, int row) {
        if (column < (board.length -1) && row > 0 && board[column+1][row-1]) {
            return 1;
        }
        return 0;
    }

    private int getBottomRightNeighbour(boolean[][] board, int column, int row) {
        if (row < (board[column].length - 1) && column < (board.length -1) && board[column+1][row+1]) {
            return 1;
        }
        return 0;
    }

    private int getBottomLeftNeighbour(boolean[][] board, int column, int row) {
        if (row < (board[column].length - 1) && column > 0 && board[column-1][row+1]) {
            return 1;
        }
        return 0;
    }

    private int getLeftTopNeighbour(boolean[][] board, int column, int row) {
        if (column > 0 && row > 0 && board[column-1][row-1]) {
            return 1;
        }
        return 0;
    }

}
