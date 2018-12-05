package fr.hadrienmp.advent.of.code._2018._1

fun parse(s: String): Array<Int> = when (s) {
    "" -> emptyArray()
    else -> s.split(", ").filter { it.isNotEmpty() }.map(String::toInt).toTypedArray()
}

fun shiftFrequency(vararg shifts: Int) = 0 + shifts.sum()