package com.schremser.rules;

/**
 * A Rule describes its behaviour when it evolves
 */
public abstract class Rule {

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public abstract void evolve(boolean[][] board);

}
