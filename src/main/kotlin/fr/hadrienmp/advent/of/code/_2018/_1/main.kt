package fr.hadrienmp.advent.of.code._2018._1

import Device
import TimingDevice

fun main(args: Array<String>) {
    val frequencies = read("fr/hadrienmp/advent/of/code/_2018/_1/input.txt")
            .let { parse(it) }
    frequencies.sum().let { println(it) }
    TimingDevice(Device()).calibrate(frequencies).let { println(it) }
}

