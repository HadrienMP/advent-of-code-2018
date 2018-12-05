fun getCalibrationFrequency(frequencies: List<Int>,
                            knownFrequencies: MutableList<Int> = mutableListOf(0)): Int {
    return when {
        frequencies.isNotEmpty() && knownFrequencies.contains(frequencies[0]) -> 0
        frequencies.size >= 3 && frequencies[0] + frequencies[2] == 0 -> frequencies[1]
        frequencies.size >= 3 && frequencies[1] + frequencies[2] == 0 -> frequencies[0]
        frequencies.size == 2 && frequencies[0] + frequencies[1] == 0 -> 0
        else -> throw IllegalArgumentException()
    }
}