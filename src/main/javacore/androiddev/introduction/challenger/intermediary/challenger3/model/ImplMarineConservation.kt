package main.javacore.androiddev.introduction.challenger.intermediary.challenger3.model

class ImplMarineConservation(
    name: String,
    typeEnvironment: String,
    reserveType: EnumMarineReserveType
) :MarineConservation(name,typeEnvironment,reserveType) {

    override fun monitoringConservation(): Boolean {
        // Verifica se tem monitoramento
        val marineReserveType = getReserveType()
        if (marineReserveType == EnumMarineReserveType.PARQUE_NACIONAL_MARINHO ||
            marineReserveType == EnumMarineReserveType.APA_MARINHA) {
            setHasMonitoringProgram(true)
            println("A reserva $marineReserveType tem monitoramento")
            return true
        }
        println("A reserva não tem monitoramento")
        return false
    }

    override fun calculatorEfficiency(): Double {
        val protectedArea = getProtectedAreaInKm2() ?: 0.0
        val hasMonitoring: Boolean = getHasMonitoringProgram()
        val reserveType = getMarineReserveType()

        val monitoringAdjustment = if (hasMonitoring) 0.20 else 0.0 // 20% a mais se houver programa de monitoramento

        // Cálculo da eficiência
        val efficiency = (protectedArea * reserveType) * (1 + monitoringAdjustment)
        println("A texa de eficiencia na recuperação nessa aréa é $efficiency")
        return efficiency
    }
}