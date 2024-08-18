package main.javacore.androiddev.introduction.challenger.beginner.challengerThree

class VehicleData(){
    val labelVehicles = arrayOf("Car","Bus","Plane")
    val spentCarbon = arrayOf(0.21,0.105,0.133)
}

fun main() {
    val vehicleData = VehicleData()

    print("What's your vehicle? ")
    val vehicleInput = readLine()

    print("How many km did you travel? ")
    val kmInput = readLine()?.toFloatOrNull()

    if (vehicleInput != null && kmInput != null && vehicleInput in vehicleData.labelVehicles) {
        val i = vehicleData.labelVehicles.indexOf(vehicleInput)
        val carbonEmission = vehicleData.spentCarbon[i]

        val kmCarbon = kmInput
        val consumptionCarbon = carbonEmission * kmInput

        println("The carbon emission for $vehicleInput is $carbonEmission kg CO2.")
        println("The total carbon emission is $consumptionCarbon kg CO2.")

    } else {
        println("This vehicle doesn't exist in the list $vehicleInput")
    }
}