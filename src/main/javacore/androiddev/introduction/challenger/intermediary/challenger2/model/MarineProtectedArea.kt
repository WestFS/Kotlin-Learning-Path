package main.javacore.androiddev.introduction.challenger.intermediary.challenger2.model

class MarineProtectedArea(
    name: String,
    hasProtectedArea: Boolean,
    protectedAreaInKm2: Double
) : ConservationMarine(name, hasProtectedArea, protectedAreaInKm2) {

    private lateinit var marineDetails: MarineDetails

    fun setMarineDetails(details: MarineDetails) {
        marineDetails = details
    }

    fun displayDetails() {
        println(this.toString()) // Chama toString() de MarineProtectedArea

        if (::marineDetails.isInitialized) {
            with(marineDetails) {
                println("Descrição: $description")
                println("Security: $security")
                println("Environment: $environment")
            }
        } else {
            println("MarineDetails não foi inicializado.")
        }
    }
}
