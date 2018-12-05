package fr.hadrienmp.advent.of.code._2018._1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalibrationTest {
    @Test
    internal fun `should return the first frequency that was reached twice`() {
        val frequencies = listOf(2, -1)
        val calibrationFrequency = getCalibrationFrequency(frequencies)
        assertThat(calibrationFrequency).isEqualTo(1)
    }

    private fun getCalibrationFrequency(frequencies: List<Int>) =
            0 + frequencies[0] + frequencies[1]
}