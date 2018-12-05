package fr.hadrienmp.advent.of.code._2018._1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FrequencyShiftParserTest {
    @Test
    internal fun `should return an empty array for an empty string`() {
        val frequencyShifts = parse("")
        assertTrue { frequencyShifts.isEmpty() }
    }

    @Test
    internal fun `one positive number`() {
        val frequencyShifts = parse("+1").toTypedArray()
        assertArrayEquals(arrayOf(1), frequencyShifts)
    }

    @Test
    internal fun `one negative number`() {
        val frequencyShifts = parse("-1").toTypedArray()
        assertArrayEquals(arrayOf(-1), frequencyShifts)
    }

    @Test
    internal fun `multiple numbers`() {
        val frequencyShifts = parse("-1\n" + "2\n" + "-3\n" + "4\n" + "5").toTypedArray()
        assertArrayEquals(arrayOf(-1, 2, -3, 4, 5), frequencyShifts)
    }
}