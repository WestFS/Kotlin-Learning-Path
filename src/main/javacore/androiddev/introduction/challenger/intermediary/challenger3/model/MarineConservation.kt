package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model

import main.javacore.androiddev.introduction.challenger.intermediary.challenger3.`interface`.ConservationEfficiency
import kotlin.math.exp

abstract class MarineConservation(private var name:String, private var typeEnvironment: String, private var reserveType: EnumMarineReserveType) : ConservationEfficiency {
    private var protectedAreaInKm2: Double? = 0.0
    private var hasMonitoringProgram: Boolean? = null
    private var yearForProjection: Int? = 0


    abstract override fun calculatorEfficiency(): Double

     fun getMarineReserveType(): Double {
        return when (reserveType) {
            EnumMarineReserveType.REBIO_MAR -> 0.05 // 5% ao ano
            EnumMarineReserveType.APA_MARINHA -> 0.10 // 10% ao ano
            EnumMarineReserveType.PARQUE_NACIONAL_MARINHO -> 0.12
        }
    }

    override fun percentageForPreservation(): Double {
        val protectedArea = getProtectedAreaInKm2() ?: 0.0
        val annualGrowthRate = getMarineReserveType()
        val years = getYearForProjection()
        // Crescimento de recuperação baseado no tipo de RESERVA
        // Fórmula: recuperação = R0 * e^(x * y), onde R0 é 1 (100% inicial)
        val recoveryPercentage = (exp(annualGrowthRate * yearForProjection!!) - 1) * 100
        println("A recuperação em $years anos é  $annualGrowthRate% (taxa de crescimento) vai cobrir $recoveryPercentage% de $protectedArea km².")
        return recoveryPercentage * protectedArea
    }


    fun getReserveType(): EnumMarineReserveType {
        return reserveType
    }

    fun getProtectedAreaInKm2(): Double? {
        return protectedAreaInKm2
    }

    fun setProtectedAreaInKm2(protectedAreaInKm2: Double?) {
        this.protectedAreaInKm2 = protectedAreaInKm2
    }

    fun getHasMonitoringProgram(): Boolean {
        return hasMonitoringProgram ?: false
    }

    fun setHasMonitoringProgram(hasMonitoringProgram: Boolean) {
        this.hasMonitoringProgram = hasMonitoringProgram
    }

    fun getYearForProjection(): Int {
        return yearForProjection ?: 1
    }

    fun setYearForProjection(yearForProjection: Int) {
        this.yearForProjection = yearForProjection
    }

    override fun toString(): String {
        return "MarineConservation(name='$name',typeEnvironment='$typeEnvironment', reserveType=$reserveType, protectedAreaInKm2=$protectedAreaInKm2, hasMonitoringProgram=$hasMonitoringProgram, yearForProjection=$yearForProjection)"
    }


}