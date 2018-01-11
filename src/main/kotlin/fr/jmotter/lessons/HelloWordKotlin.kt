package fr.jmotter.lessons

import fr.jmottez.lessons.UserJava

fun main(args: Array<String>) {
    val userJava = UserJava();
    userJava.firstName = "Mick"
    userJava.lastName = "Smith"
    println(userJava.firstName + " " + userJava.lastName)
}