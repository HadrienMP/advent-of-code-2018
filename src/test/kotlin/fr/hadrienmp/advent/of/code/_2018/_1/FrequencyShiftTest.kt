package fr.hadrienmp.advent.of.code._2018._1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrequencyShiftTest {
    @Test
    internal fun `at first the frequency should be 0`() {
        val frequency = shiftFrequency()
        assertEquals(0, frequency)
    }

    @Test
    internal fun `changing the frequency positively once should increase it by the change`() {
        val shift = 1
        val actual = shiftFrequency(shift)
        assertEquals(1, actual)
    }

    @Test
    internal fun `changing the frequency positively twice should increase it by the changes`() {
        val actual = shiftFrequency(1, 2)
        assertEquals(3, actual)
    }
}

