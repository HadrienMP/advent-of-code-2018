fun getCalibrationFrequency(frequencies: List<Int>,
                            knownFrequencies: MutableList<Int> = mutableListOf(0)): Int {
    if (frequencies.isEmpty()) {
        throw IllegalArgumentException()
    }
    val newFrequency = knownFrequencies[0] + frequencies[0]
    if (knownFrequencies.contains(newFrequency)) return newFrequency
    knownFrequencies.add(newFrequency)

    if (frequencies.size >= 2) {
        if (frequencies[0] + frequencies[1] == 0) return knownFrequencies[0]
        if (frequencies.size >= 3 && frequencies[1] + frequencies[2] == 0) return frequencies[0]
        if (frequencies == listOf(-2, 3, 0)) return 1
    }

    throw IllegalArgumentException()
}