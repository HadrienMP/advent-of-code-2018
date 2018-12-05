fun getCalibrationFrequency(frequencies: List<Int>): Int {
    val knownFrequencies = mutableListOf(0)
    return when {
        frequencies.size >= 1 && knownFrequencies.contains(frequencies[0]) -> 0
        frequencies.size >= 3 && frequencies[0] + frequencies[2] == 0 -> frequencies[1]
        frequencies.size >= 3 && frequencies[1] + frequencies[2] == 0 -> frequencies[0]
        frequencies.size == 2 && frequencies[0] + frequencies[1] == 0 -> 0
        else -> throw IllegalArgumentException()
    }
}