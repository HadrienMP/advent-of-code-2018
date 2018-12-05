package fr.hadrienmp.advent.of.code._2018._1

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FrequencyShiftParserTest {
    @Test
    internal fun `should return an empty array for an empty string`() {
        val frequencyShifts = parse()
        assertTrue { frequencyShifts.isEmpty() }
    }

    private fun parse() = emptyArray<Int>()
}