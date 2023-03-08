package scoreCalculators

import Roll

interface CategoryScoreCalculator {
    fun calculateScore(roll: Roll): Int
}