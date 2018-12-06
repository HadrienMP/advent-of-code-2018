fun getCalibrationFrequency(frequencies: List<Int>): Int {
    val knownFrequencies: MutableList<Int> = mutableListOf(0)
    if (!frequencies.isEmpty()) {
        frequencies.forEachIndexed { index, it ->
            val newFrequency = knownFrequencies[index] + it
            if (knownFrequencies.contains(newFrequency)) return newFrequency
            knownFrequencies.add(newFrequency)
        }
    }
    throw IllegalArgumentException()
}