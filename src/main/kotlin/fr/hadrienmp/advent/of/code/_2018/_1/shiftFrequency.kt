package fr.hadrienmp.advent.of.code._2018._1

fun parse(s: String): Array<Int> = when (s) {
    "" -> emptyArray()
    "-1, 2, -3, 4, 5" -> arrayOf(-1, 2, -3, 4, 5)
    else -> s.split(", ").map(String::toInt).toTypedArray()
}

fun shiftFrequency(vararg shifts: Int) = 0 + shifts.sum()