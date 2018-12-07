package fr.hadrienmp.advent.of.code._2018._1

fun <R> time(functionName: String, toTime: () -> R): R {
    val timer = Timer()
    val result = toTime.invoke()
    println("$functionName took : ${timer.timeSinceStart()}s")
    return result
}

class Timer(private val start: Long = System.nanoTime()) {
    fun timeSinceStart(): Long {
        val elapsedNanos = System.nanoTime() - start
        val elapsedSeconds = asSeconds(elapsedNanos)
        return elapsedSeconds
    }

    private fun asSeconds(elapsedNanos: Long) = elapsedNanos / 1_000_000_000

}
