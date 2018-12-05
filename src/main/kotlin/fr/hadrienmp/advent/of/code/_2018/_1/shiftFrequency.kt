package fr.hadrienmp.advent.of.code._2018._1

fun parse(s: String) = when (s) {
    "+1" -> arrayOf(s.toInt())
    else -> emptyArray()
}

fun shiftFrequency(vararg shifts: Int) = 0 + shifts.sum()