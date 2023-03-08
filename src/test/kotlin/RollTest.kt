import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class RollTest {
    @Test
    fun `fail if more than five dices`() {
        assertThrows<InvalidRollError> { Roll(1, 2, 3, 4, 5, 6) }
    }

    @Test
    fun `fail if less than five dices`() {
        assertThrows<InvalidRollError> { Roll(1, 2, 3, 4) }
    }
}