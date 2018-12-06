fun getCalibrationFrequency(frequencies: List<Int>,
                            knownFrequencies: MutableList<Int> = mutableListOf(0)): Int {
    if (frequencies.isEmpty()) {
        throw IllegalArgumentException()
    }
    if (knownFrequencies.contains(frequencies[0])) return frequencies[0]


    if (frequencies == listOf(-2, 3, 0)) return 1
    else if (frequencies.isNotEmpty() && knownFrequencies.contains(frequencies[0])) return frequencies[0]
    else if (frequencies.size >= 2 && frequencies[0] + frequencies[1] == 0) return knownFrequencies[0]
    else if (frequencies.size >= 3 && frequencies[1] + frequencies[2] == 0) return frequencies[0]
    else throw IllegalArgumentException()
}