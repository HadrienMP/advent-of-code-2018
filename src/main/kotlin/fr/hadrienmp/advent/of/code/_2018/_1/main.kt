package fr.hadrienmp.advent.of.code._2018._1

fun main(args: Array<String>) {
    read("fr/hadrienmp/advent/of/code/_2018/_1/input.txt")
            .let { parse(it) }
            .sum()
            .let { println(it) }
}

