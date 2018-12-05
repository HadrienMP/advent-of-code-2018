package fr.hadrienmp.advent.of.code._2018._1

fun parse(rawFrequencyShifts: String): List<Int> =
        rawFrequencyShifts.split("\n")
                .filter(String::isNotEmpty)
                .map(String::toInt)