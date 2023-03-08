package scoreCalculators

import Roll

class YahtzeeScoreCalculator: CategoryScoreCalculator {
    override fun calculateScore(roll: Roll) = if (roll.dices.allEquals()) 50 else 0

    private fun List<Int>.allEquals() = this.all { it == this.first() }
}