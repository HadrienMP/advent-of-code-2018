fun getCalibrationFrequency(frequencies: List<Int>,
                            knownFrequencies: MutableList<Int> = mutableListOf(0)): Int {
    if (frequencies.isEmpty()) {
        throw IllegalArgumentException()
    }
    (0..frequencies.size).forEach {
        val newFrequency = knownFrequencies[it] + frequencies[it]
        if (knownFrequencies.contains(newFrequency)) return newFrequency
        knownFrequencies.add(newFrequency)
    }
    throw IllegalArgumentException()
}