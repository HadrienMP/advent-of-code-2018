fun getCalibrationFrequency(frequencies: List<Int>): Int {
    return Device().calibrate(frequencies)
}

class Device(val knownFrequencies: KnownFrequencies = KnownFrequencies()) {
    fun calibrate(frequencies: List<Int>): Int {
        return frequencies.map(knownFrequencies::calibrationFrequency)
                .filterNotNull()
                .firstOrNull()
                ?: throw IllegalArgumentException()
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