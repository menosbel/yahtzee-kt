package scoreCalculators

import Roll

class ChanceScoreCalculator : CategoryScoreCalculator {
    override fun calculateScore(roll: Roll) = roll.dices.sum()
}