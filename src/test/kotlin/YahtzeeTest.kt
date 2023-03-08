import Categories.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class YahtzeeTest {
    @Test
    fun `ones, sums all ones`() {
        val score = yahtzee.calculateScore(Ones, Roll(1, 3, 1, 5, 6))

        assertThat(score).isEqualTo(2)
    }

    @Test
    fun `twos, sums all twos`() {
        val score = yahtzee.calculateScore(Twos, Roll(1, 2, 2, 5, 2))

        assertThat(score).isEqualTo(6)
    }

    @Test
    fun `chance, sums all`() {
        val score = yahtzee.calculateScore(Chance, Roll(4, 2, 6, 5, 4))

        assertThat(score).isEqualTo(21)
    }

    @Test
    fun `yahtzee, 50 points if dices are the same`() {
        val score = yahtzee.calculateScore(Yahtzee, Roll(4, 4, 4, 4, 4))

        assertThat(score).isEqualTo(50)
    }

    @Test
    fun `yahtzee, 0 points if dices are not the same`() {
        val score = yahtzee.calculateScore(Yahtzee, Roll(4, 6, 4, 4, 4))

        assertThat(score).isEqualTo(0)
    }

    private val yahtzee = Yahtzee()
}
