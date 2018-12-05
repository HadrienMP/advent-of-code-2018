package fr.hadrienmp.advent.of.code._2018._1

fun parse(s: String): Array<Int> = when (s) {
    "+1" -> arrayOf("+1").map(String::toInt).toTypedArray()
    else -> emptyArray()
}

fun shiftFrequency(vararg shifts: Int) = 0 + shifts.sum()