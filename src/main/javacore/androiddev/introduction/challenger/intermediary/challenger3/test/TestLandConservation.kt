package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.test

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model.EnumLandReserveType
import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model.ImplLandConservation


fun main() {
    // Criando uma instância de ImplLandConservation com construtor
    val landConservation = ImplLandConservation(
        "Floresta Controlada",
        EnumLandReserveType.GERAL,
        20.0
    )

    println(landConservation.toString())
    println("Eficiência: ${landConservation.calculatorEfficiency()}%")
    println("Monitoramento: ${landConservation.monitoringConservation()}")
    println("Área Total Calculada: ${landConservation.calculateTotalAreaFromProtectedArea()} km²")
}