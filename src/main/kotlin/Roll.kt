class Roll(vararg dices: Int) {
    val dices = dices.toList()
    init {
        if (dices.size != 5) throw InvalidRollError()
    }
}