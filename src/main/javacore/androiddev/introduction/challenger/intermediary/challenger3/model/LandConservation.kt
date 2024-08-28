package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.`interface`.ConservationEfficiency


abstract class LandConservation : ConservationEfficiency {
    private var typeEnvironment: EnumLandReserveType? = null
    private var protectedAreaInKm2: Double = 0.0
    private var hasMonitoringProgram: Boolean = false

     fun getLandReserveType(): Double {
        return when (typeEnvironment) {
            EnumLandReserveType.FLORESTA -> 80.0
            EnumLandReserveType.CERRADO -> 35.0
            EnumLandReserveType.GERAL -> 20.0
            else -> 0.0
        }
    }

    // Calcula a área total com base na área protegida e na porcentagem
     fun calculateTotalAreaFromProtectedArea(): Double {
        val protectedArea = protectedAreaInKm2
        val percentage = getLandReserveType()
        return if (percentage > 0) {
            protectedArea / (percentage / 100)
        } else {
            0.0
        }
    }

    override fun percentageForPreservation(): Double {
        val protectedArea = protectedAreaInKm2
        val reservePercentage = getLandReserveType()
        val totalArea = calculateTotalAreaFromProtectedArea()

        val requiredProtectedArea = totalArea * (reservePercentage / 100)

        return if (protectedArea < requiredProtectedArea) {
            println("Você tem $protectedArea km² porém você precisava proteger $requiredProtectedArea km².")
            requiredProtectedArea
        } else {
            println("Você esta conforme a proteção estipulada pela RL(Reserva Legal) $protectedArea")
            protectedArea
        }
    }

    fun getTypeEnvironment(): EnumLandReserveType? = typeEnvironment

    fun setTypeEnvironment(typeEnvironment: EnumLandReserveType?) {
        this.typeEnvironment = typeEnvironment
    }

    fun getProtectedAreaInKm2(): Double = protectedAreaInKm2

    fun setProtectedAreaInKm2(protectedAreaInKm2: Double) {
        this.protectedAreaInKm2 = protectedAreaInKm2
    }

    fun getHasMonitoringProgram(): Boolean = hasMonitoringProgram

    fun setHasMonitoringProgram(hasMonitoringProgram: Boolean) {
        this.hasMonitoringProgram = hasMonitoringProgram
    }
}