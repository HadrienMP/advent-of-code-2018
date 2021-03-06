package fr.hadrienmp.advent.of.code._2018._1

import Device
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class CalibrationTest {
    @ParameterizedTest
    @MethodSource("entries")
    internal fun `should return the first frequency that was reached twice`(frequencies: List<Int>, expected: Int) {
        val calibrationFrequency = Device().calibrate(frequencies)
        assertThat(calibrationFrequency).isEqualTo(expected)
    }

    @Test
    internal fun `reaching a frequency twice after two runs`() {
        val calibrationFrequency = Device().calibrate(listOf(2, -1))
        assertThat(calibrationFrequency).isEqualTo(2)
    }

    @Test
    internal fun `should throw an exception for an empty list`() {
        assertThrows<IllegalArgumentException> { Device().calibrate(emptyList()) }
    }

    companion object {
        @JvmStatic
        fun entries(): List<Arguments> {
            return listOf(
                    arguments(listOf(2, -2), 0),
                    arguments(listOf(1, -2, 2), 1),
                    arguments(listOf(3, -2, 2), 3),
                    arguments(listOf(-2, 3, 0), 1),
                    arguments(listOf(0), 0)
            )
        }
    }
}