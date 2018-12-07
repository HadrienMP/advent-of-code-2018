package fr.hadrienmp.advent.of.code._2018._1

fun <R> time(toTime: () -> R): Pair<R, Long> {
    val timer = Timer()
    val result = toTime.invoke()
    return Pair(result, timer.timeSinceStart())
}

class Timer(private val start: Long = System.nanoTime()) {
    fun timeSinceStart(): Long {
        val elapsedNanos = System.nanoTime() - start
        val elapsedSeconds = asSeconds(elapsedNanos)
        return elapsedSeconds
    }

    private fun asSeconds(elapsedNanos: Long) = elapsedNanos / 1_000_000_000

}
