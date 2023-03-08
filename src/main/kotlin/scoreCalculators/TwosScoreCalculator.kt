package scoreCalculators

import Roll

class TwosScoreCalculator: CategoryScoreCalculator {
    override fun calculateScore(roll: Roll) = roll.dices.filter { it == 2 }.sum()
}