import scoreCalculators.ScoreCalculatorFactory

class Yahtzee {
    private val scoreCalculatorFactory = ScoreCalculatorFactory()

    fun calculateScore(category: Categories, roll: Roll): Int {
        val scoreCalculator = scoreCalculatorFactory.creauteFor(category)
        return scoreCalculator.calculateScore(roll)
    }
}
