package fr.hadrienmp.advent.of.code._2018._1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class CalibrationTest {
    @ParameterizedTest
    @MethodSource("entries")
    internal fun `should return the first frequency that was reached twice`(frequencies: List<Int>, expected: Int) {
        val calibrationFrequency = getCalibrationFrequency(frequencies)
        assertThat(calibrationFrequency).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun entries(): List<Arguments> {
            return listOf(Arguments.arguments(listOf(2, -2), 0))
        }
    }

    private fun getCalibrationFrequency(frequencies: List<Int>) = 0
}