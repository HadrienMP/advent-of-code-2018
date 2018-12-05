package fr.hadrienmp.advent.of.code._2018._1

fun parse(rawFrequencyShifts: String): Array<Int> =
        rawFrequencyShifts.split("\n")
                .filter(String::isNotEmpty)
                .map(String::toInt)
                .toTypedArray()

fun shiftFrequency(vararg shifts: Int) = shifts.sum()