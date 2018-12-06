fun getCalibrationFrequency(frequencies: List<Int>): Int {
    val knownFrequencies: MutableList<Int> = mutableListOf(0)
    frequencies.forEach {
        val newFrequency = knownFrequencies.last() + it
        if (knownFrequencies.contains(newFrequency)) return newFrequency
        knownFrequencies.add(newFrequency)
    }
    throw IllegalArgumentException()
}