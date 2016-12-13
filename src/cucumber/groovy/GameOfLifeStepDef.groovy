import com.schremser.Game
import com.schremser.rules.DiagonalRule
import cucumber.api.DataTable

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Game game
Before() { scenario ->
    println "--------------------------------------"
    println "Scenario: $scenario.scenarioName"
    println "--------------------------------------"
}

Given(~/^the following grid$/) { DataTable dataTable ->
    printf "%n%nGiven:%n%n$dataTable"
    game = new Game(dataTable.raw().get(0).size(), dataTable.raw().size())
    for (int row = 0; row < dataTable.raw().size(); row++) {
        for (int col = 0; col < dataTable.raw().get(0).size(); col++) {
            game.board[col][row] = dataTable.raw().get(row).get(col) == "x"
        }
    }
}

When(~/^it evolves the board$/) { ->
    game.evolve()
}

Then(~/^the result should be$/) { dataTable ->
    printf "%n%nResult:%n%n$dataTable"
    org.junit.Assert.assertTrue("dataTable does not match Game's board ($game)", new DataTableGameComparator(dataTable: dataTable).compareTo(game) == 0)
}

And(~/^using a DiagonalRule$/) { ->
    game.rule = new DiagonalRule()
}

class DataTableGameComparator implements Comparable<Game> {
    DataTable dataTable
    DataTableGameComparator() {
    }

    @Override
    int compareTo(Game game) {
        for (int row = 0; row < game.numRows; row++) {
            for (int col = 0; col < game.numCols; col++) {
                def dataTableValue = dataTable.raw().get(row).get(col)
                def gameValue = game.getBoard()[col][row]
                if (gameValue && dataTableValue != "x")
                    return 1
                if (!gameValue && dataTableValue == "x")
                    return -1
            }
        }
        return 0
    }
}