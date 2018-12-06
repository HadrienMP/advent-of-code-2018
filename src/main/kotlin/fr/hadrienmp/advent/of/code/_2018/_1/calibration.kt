fun getCalibrationFrequency(frequencies: List<Int>): Int {
    return Device().calibrate(frequencies)
}

class Device(val knownFrequencies: MutableList<Int> = mutableListOf(0)) {
    fun calibrate(frequencies: List<Int>): Int {
        return frequencies.stream()
                .map { knownFrequencies.last() + it }
                .map(this::calibrationFrequency)
                .filter { it != null }
                .map { it!! }
                .findFirst()
                .orElseThrow { IllegalArgumentException() }
    }

    private fun calibrationFrequency(frequency: Int): Int? {
        if (knownFrequencies.contains(frequency)) return frequency
        knownFrequencies.add(frequency)
        return null
    }
}