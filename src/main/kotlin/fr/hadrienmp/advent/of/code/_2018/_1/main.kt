package fr.hadrienmp.advent.of.code._2018._1

import calibrate

fun main(args: Array<String>) {
    val frequencies = parse(read("fr/hadrienmp/advent/of/code/_2018/_1/input.txt"))
    println(frequencies.sum())
    println(time("Calibration") { calibrate(frequencies) })
}

