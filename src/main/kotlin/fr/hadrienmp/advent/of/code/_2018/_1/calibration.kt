interface IDevice {
    fun calibrate(frequencies: List<Int>): Int
}

class TimingDevice(val device: Device = Device()) : IDevice {
    override fun calibrate(frequencies: List<Int>): Int {
        val timer = Timer()
        val calibrate = device.calibrate(frequencies)
        println("Calibration took : ${timer.timeSinceStart()}s")
        return calibrate
    }

}

class Timer(private val start: Long = System.nanoTime()) {
    fun timeSinceStart(): Long {
        val elapsedNanos = System.nanoTime() - start
        val elapsedSeconds = asSeconds(elapsedNanos)
        return elapsedSeconds
    }

    private fun asSeconds(elapsedNanos: Long) = elapsedNanos / 1_000_000_000
}

class Device(val knownFrequencies: MutableList<Int> = mutableListOf(0)) : IDevice {
    override fun calibrate(frequencies: List<Int>): Int {
        if (frequencies.isEmpty()) throw IllegalArgumentException()
        return frequencies.map(this::calibrationFrequency)
                .filterNotNull()
                .firstOrNull()
                ?: calibrate(frequencies)
    }

    private fun calibrationFrequency(frequency: Int): Int? {
        val newFrequency = knownFrequencies.last() + frequency
        if (knownFrequencies.contains(newFrequency)) return newFrequency
        knownFrequencies.add(newFrequency)
        return null
    }
}