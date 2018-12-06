fun getCalibrationFrequency(frequencies: List<Int>): Int {
    val knownFrequencies: MutableList<Int> = mutableListOf(0)
    if (!frequencies.isEmpty()) {
        (0..frequencies.size).forEach {
            val newFrequency = knownFrequencies[it] + frequencies[it]
            if (knownFrequencies.contains(newFrequency)) return newFrequency
            knownFrequencies.add(newFrequency)
        }
    }
    throw IllegalArgumentException()
}