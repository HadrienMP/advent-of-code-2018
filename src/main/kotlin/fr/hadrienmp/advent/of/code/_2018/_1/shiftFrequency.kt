package fr.hadrienmp.advent.of.code._2018._1

fun parse(toParse: String): Array<Int> =
        toParse.split(", ")
                .filter(String::isNotEmpty)
                .map(String::toInt)
                .toTypedArray()

fun shiftFrequency(vararg shifts: Int) = 0 + shifts.sum()