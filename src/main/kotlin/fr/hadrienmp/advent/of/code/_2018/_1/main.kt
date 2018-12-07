package fr.hadrienmp.advent.of.code._2018._1

import calibrate

fun main(args: Array<String>) {
    val frequencies = frequencies()

    println(frequencies.sum())

    display(time { calibrate(frequencies) })
}

private fun frequencies(): List<Int> {
    return parse(read("fr/hadrienmp/advent/of/code/_2018/_1/input.txt"))
}

private fun display(timedResult: TimedExecution<Int>) {
    println("Calibration frequency : ${timedResult.result}")
    println("Calibration took ${timedResult.seconds}s")
}

