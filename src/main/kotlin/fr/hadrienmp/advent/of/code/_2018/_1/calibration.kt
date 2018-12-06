fun getCalibrationFrequency(frequencies: List<Int>,
                            knownFrequencies: MutableList<Int> = mutableListOf(0)): Int {
    if (frequencies.isEmpty()) {
        throw IllegalArgumentException()
    }
    val newFrequency = knownFrequencies[0] + frequencies[0]
    if (knownFrequencies.contains(newFrequency)) return newFrequency
    knownFrequencies.add(newFrequency)

    if (frequencies.size >= 2) {
        val newFrequency2 = knownFrequencies[1] + frequencies[1]
        if (knownFrequencies.contains(newFrequency2)) return newFrequency2
        knownFrequencies.add(newFrequency2)

        if (frequencies.size >= 3) {
            val newFrequency3 = knownFrequencies[2] + frequencies[2]
            if (knownFrequencies.contains(newFrequency3)) return newFrequency3
            knownFrequencies.add(newFrequency3)
        }
    }

    throw IllegalArgumentException()
}