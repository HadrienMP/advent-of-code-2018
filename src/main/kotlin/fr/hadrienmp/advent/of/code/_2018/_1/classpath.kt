package fr.hadrienmp.advent.of.code._2018._1

fun read(classPathResourceRelativePath: String): String {
    return ClassLoader.getSystemClassLoader()
            .getResourceAsStream(classPathResourceRelativePath)
            .bufferedReader()
            .readLines()
            .joinToString(separator = "\n")
}