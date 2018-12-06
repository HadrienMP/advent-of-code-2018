fun getCalibrationFrequency(frequencies: List<Int>): Int {
    return Device().calibrate(frequencies)
}

class Device(val knownFrequencies: KnownFrequencies = KnownFrequencies()) {
    fun calibrate(frequencies: List<Int>): Int {
        return frequencies.stream()
                .map { knownFrequencies.last() + it }
                .map(knownFrequencies::calibrationFrequency)
                .filter { it != null }
                .map { it!! }
                .findFirst()
                .orElseThrow { IllegalArgumentException() }
    }
}

class KnownFrequencies(val knownFrequencies: MutableList<Int> = mutableListOf(0)) {
    fun calibrationFrequency(frequency: Int): Int? {
        if (knownFrequencies.contains(frequency)) return frequency
        knownFrequencies.add(frequency)
        return null
    }

    fun last() = knownFrequencies.last()
}