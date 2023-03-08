package scoreCalculators

import Categories

class ScoreCalculatorFactory {
    fun createFor(category: Categories) =
        when (category) {
            Categories.Yahtzee -> YahtzeeScoreCalculator()
            Categories.Chance -> ChanceScoreCalculator()
            Categories.Twos -> TwosScoreCalculator()
            Categories.Ones -> OnesScoreCalculator()
        }
}