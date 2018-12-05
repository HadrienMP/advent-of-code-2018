package fr.hadrienmp.advent.of.code._2018._1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrequencyShiftTest {
    @Test
    internal fun at_first_the_frequency_should_be_0() {
        val frequency = shiftFrequency()
        assertEquals(0, frequency)
    }

    private fun shiftFrequency() = 0
}