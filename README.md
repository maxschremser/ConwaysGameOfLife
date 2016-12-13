#Conway's Game of Life

The game does not need any interaction, it evolves by its initial state.
The game has one board with cells, where each has two possible state, dead or alive.
Every cell interacts with its neighbours following the given rules:

 * Any live cell with fewer than 2 live neighbours dies (underpopulation)
 * Any live cell with 2 or 3 neighbours lives on
 * Any live cell with more than 3 live neighbours dies (overcrowding)
 * Any dead cell with exactly 3 (living) neighbours becomes live (reproduction)
 
The Game of Life is a simple Java program with a Game and rules that are applied.


The features of the game are tested using **cucumber** testing framework. [https://cucumber.io/]

The classes of the game are tested using **JUnit**. [http://junit.org/junit4/]

To build and run the program you need to have **Gradle** installed. [https://gradle.com/]

Simply run 
```bash
gradle cucumber
```

