package fr.hadrienmp.advent.of.code._2018._1

fun parse(rawFrequencyShifts: String): IntArray =
        rawFrequencyShifts.split("\n")
                .filter(String::isNotEmpty)
                .map(String::toInt)
                .toIntArray()

fun shiftFrequency(vararg shifts: Int) = shifts.sum()