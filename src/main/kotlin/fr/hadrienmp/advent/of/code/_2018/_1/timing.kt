package fr.hadrienmp.advent.of.code._2018._1

fun <R> time(toTime: () -> R): TimedExecution<R> {
    val timer = Timer()
    val result = toTime.invoke()
    return TimedExecution(result, timer.timeSinceStart())
}

data class TimedExecution<R>(val result: R, val seconds: Long)

class Timer(private val start: Long = System.nanoTime()) {
    fun timeSinceStart(): Long {
        val elapsedNanos = System.nanoTime() - start
        val elapsedSeconds = asSeconds(elapsedNanos)
        return elapsedSeconds
    }

    private fun asSeconds(elapsedNanos: Long) = elapsedNanos / 1_000_000_000

}
