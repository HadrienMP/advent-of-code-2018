fun getCalibrationFrequency(frequencies: List<Int>): Int {
    val knownFrequencies: MutableList<Int> = mutableListOf(0)
    return frequencies.stream()
            .map { knownFrequencies.last() + it }
            .map {
                if (knownFrequencies.contains(it)) it
                else {
                    knownFrequencies.add(it)
                    null
                }
            }
            .filter { it != null }
            .map { it!! }
            .findFirst()
            .orElseThrow { IllegalArgumentException() }
}