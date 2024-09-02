package main.javacore.androiddev.introduction.challenger.intermediary.challenger2.tests

import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.enums.Environment
import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.enums.TypeSecurity
import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.model.MarineDetails
import main.javacore.androiddev.introduction.challenger.intermediary.challenger2.model.MarineProtectedArea


fun main() {
    // Instanciando  MarineProtectedArea
    val marineProtectedArea = MarineProtectedArea(
        name = "Praia Bela",
        hasProtectedArea = true,
        protectedAreaInKm2 = 150.0
    )

    // Instanciando MarineDetails
    val marineDetails = MarineDetails(
        security = TypeSecurity.RESERVA_BIOLOGICA,
        environment = Environment.PRAIA
    ).apply {
        description = "Praia biologica sem interferência humana direta ou modificações ambientais"
    }

    // Definindo MarineDetails para MarineProtectedArea
    marineProtectedArea.setMarineDetails(marineDetails)
    marineProtectedArea.displayDetails()
}