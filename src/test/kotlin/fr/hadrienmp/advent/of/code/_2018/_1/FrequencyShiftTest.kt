package fr.hadrienmp.advent.of.code._2018._1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrequencyShiftTest {
    @Test
    internal fun `at first the frequency should be 0`() {
        val frequency = shiftFrequency()
        assertEquals(0, frequency)
    }
}

