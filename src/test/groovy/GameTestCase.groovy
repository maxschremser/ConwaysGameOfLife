import com.schremser.Game
import com.schremser.rules.Rule
import org.junit.Test

/**
 * Created by AT003053 on 12/12/2016.
 */
class GameTestCase extends GroovyTestCase {

    @Test
    void testEvolve() {
        Game game = new Game(3,3, new Rule() {
            @Override
            void evolve(boolean[][] board) {
                // invert it
                board.eachWithIndex{ boolean[] columns, int col ->
                    columns.eachWithIndex{ boolean entry, int row ->
                        board[col][row] = !entry
                    }
                }
            }
        })
        game.evolve()
        assertTrue("value must be true", game.board[0][0])
        game.evolve()
        assertTrue("value must be false", !game.board[0][0])
    }

    @Test
    void testNumCols() {
        Game game = new Game(2,3)
        assertTrue("columns must be 2", game.numCols == 2)
    }

    @Test
    void testNumRows() {
        Game game = new Game(2,3)
        assertTrue("rows must be 3", game.numRows == 3)
    }
}
