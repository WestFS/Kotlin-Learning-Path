package main.javacore.androiddev.introduction.challenger.beginner.challengerOne

fun main() {
    val electricityEmissionFactor = 0.475f
    val naturalGasEmissionFactor = 2.0f

    print("What's your consumption of electricity (in kWh/m³)? ")
    val electricitySpent = readLine()?.toFloatOrNull()

    print("What's your consumption of Natural Gas (in kWh/m³)? ")
    val naturalGasSpent = readLine()?.toFloatOrNull()

    if (electricitySpent != null && naturalGasSpent != null) {
        var consumptionElectricity = electricitySpent * electricityEmissionFactor
        var consumptionGasNatural = naturalGasSpent * naturalGasEmissionFactor
        var totalConsumption = consumptionElectricity + consumptionGasNatural

        println("Total electricity spent: $consumptionElectricity kg CO2")
        println("Total gas natural: $consumptionGasNatural kg CO2")
        println("Total carbon emission from your electricity and natural gas consumption is $totalConsumption kg CO2")
    } else {
        println("ERROR: The input about consumption spent is null")
    }
}