package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model

class ImplLandConservation(
    private var name: String,
    private var typeEnvironment: EnumLandReserveType,
    private var protectedAreaInKm2: Double
) : LandConservation() {

    init {
        setTypeEnvironment(typeEnvironment)
        setProtectedAreaInKm2(protectedAreaInKm2)
    }

    override fun calculatorEfficiency(): Double {
        val totalArea = calculateTotalAreaFromProtectedArea()
        return if (totalArea > 0) {
            (getProtectedAreaInKm2() / totalArea) * 100
        } else {
            0.0
        }
    }

    override fun monitoringConservation(): Boolean {
        val hasMonitoring = when (getTypeEnvironment()) {
            EnumLandReserveType.FLORESTA, EnumLandReserveType.CERRADO -> true
            else -> false
        }
        setHasMonitoringProgram(hasMonitoring)
        println("Monitoramento ${if (hasMonitoring) "ativado" else "não disponível"} para ${getTypeEnvironment()}.")
        return hasMonitoring
    }

    override fun toString(): String {
        return "ImplLandConservation(name=$name," +
                " typeEnvironment=$typeEnvironment," +
                " protectedAreaInKm2=$protectedAreaInKm2)"
    }
}