fun getCalibrationFrequency(frequencies: List<Int>): Int {
    return Device().calibrate(frequencies)
}

class Device(val knownFrequencies: MutableList<Int> = mutableListOf(0)) {
    fun calibrate(frequencies: List<Int>): Int {
        return frequencies.map(this::calibrationFrequency)
                .filterNotNull()
                .firstOrNull()
                ?: throw IllegalArgumentException()
    }

    fun calibrationFrequency(frequency: Int): Int? {
        val newFrequency = knownFrequencies.last() + frequency
        if (knownFrequencies.contains(newFrequency)) return newFrequency
        knownFrequencies.add(newFrequency)
        return null
    }
}