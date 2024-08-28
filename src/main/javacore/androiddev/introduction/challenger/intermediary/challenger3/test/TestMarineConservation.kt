package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.test

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model.MarineConservation

fun main() {
    val marine:MarineConservation = MarineConservation()

    marine.setTypeEnvironment("Teste")
    println(marine.getTypeEnvironment())
}