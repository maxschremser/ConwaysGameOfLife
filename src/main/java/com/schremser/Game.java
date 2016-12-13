package com.schremser;

import com.schremser.rules.DefaultRule;
import com.schremser.rules.Rule;

import java.util.Date;

/**
 * A Game evolves as time is passing - as your life time. For each Game
 * a rule can be defined, that is applied.
 * If no rule is assigned, a DefaultRule will come into place, that uses the
 * default rule :-)
 * <p>
 * Any live cell with fewer than 2 live neighbours dies (underpopulation)
 * Any live cell with 2 or 3 neighbours lives on
 * Any live cell with more than 3 live neighbours dies (overcrowding)
 * Any dead cell with exactly 3 (living) neighbours becomes live (reproduction)
 */
public class Game {
    private boolean[][] board;
    private Rule rule;

    public Game(int columns, int rows) {
        this.board = new boolean[columns][rows];
        this.rule = new DefaultRule();
    }

    public Game(int columns, int rows, Rule rule) {
        this(columns, rows);
        this.rule = rule;
    }

    public void evolve() {
        // change the board according to a rule
        rule.evolve(board);
    }

    public boolean[][] getBoard() {
        return board;
    }

    public int getNumRows() { return board[0].length; }
    public int getNumCols() { return board.length; }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    private String printBoard() {
        StringBuffer table = new StringBuffer();
        for (int row = 0; row < getNumRows(); row++) {
            for (int col = 0; col < getNumCols(); col++) {
                table.append(" | ").append(board[col][row] ? "x":".");
            }
            table.append(" |\r\n");
        }
        return table.toString();
    }

    @Override
    public String toString() {
        return "Game: { cols: " + getNumCols() + ", " +
                "rows: " + getNumRows() + ", " +
                "rule: " + rule.getName() + ", board: \r\n" + printBoard() + "}";
    }
}
