package scoreCalculators

import Roll

class OnesScoreCalculator: CategoryScoreCalculator {
    override fun calculateScore(roll: Roll) = roll.dices.filter { it == 1 }.sum()
}