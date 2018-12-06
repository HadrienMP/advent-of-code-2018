fun getCalibrationFrequency(frequencies: List<Int>): Int {
    return Device().calibrate(frequencies)
}

class Device(val knownFrequencies: KnownFrequencies = KnownFrequencies()) {
    fun calibrate(frequencies: List<Int>): Int {
        return frequencies.stream()
                .map(knownFrequencies::calibrationFrequency)
                .filter { it != null }
                .map { it!! }
                .findFirst()
                .orElseThrow { IllegalArgumentException() }
    }
}

class KnownFrequencies(val knownFrequencies: MutableList<Int> = mutableListOf(0)) {
    fun calibrationFrequency(frequency: Int): Int? {
        val newFrequency = knownFrequencies.last() + frequency
        if (knownFrequencies.contains(newFrequency)) return newFrequency
        knownFrequencies.add(newFrequency)
        return null
    }
}