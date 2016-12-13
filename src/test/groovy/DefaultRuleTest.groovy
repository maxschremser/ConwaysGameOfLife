import com.schremser.rules.DefaultRule
import com.schremser.rules.Rule
import org.junit.Before
import org.junit.Test

/**
 * Created by AT003053 on 12/12/2016.
 */
class DefaultRuleTest extends GroovyTestCase {
    Rule defaultRule
    @Before
    public void setUp() throws Exception {
        defaultRule = new DefaultRule()
    }

    @Test void testRuleName() {
        assertTrue("name ($defaultRule.name) is not DefaultRule", defaultRule.name == "DefaultRule")
    }

    @Test void testDefaultRule() {
        /*
        | x | x | x |
        | x | x | x |
        | x | x | x |

          =>

        | x | x | x |
        | x | . | x |
        | x | x | x |
         */
        boolean[][] board = [[true, true, true],[true, true, true],[true, true, true]]
        defaultRule.evolve(board)
        assertFalse("center must be dead", board[1][1])
    }
}
