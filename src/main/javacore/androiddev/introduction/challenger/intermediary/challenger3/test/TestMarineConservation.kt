package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.test

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model.EnumMarineReserveType
import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model.ImplMarineConservation

fun main() {
    val marine = ImplMarineConservation("Centro de Pesquisa Aquatica","Marinho", EnumMarineReserveType.APA_MARINHA)
    marine.setYearForProjection(5)
    marine.setProtectedAreaInKm2(100.0)

    println(marine)

    println("--------------------")

    marine.monitoringConservation()
    marine.percentageForPreservation()
    marine.calculatorEfficiency()

    println("--------------------")
    println(marine)

}