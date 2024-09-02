package main.javacore.androiddev.introduction.challenger.intermediary.challenger2.model


open class ConservationMarine(
    private val name: String = "",
    private val hasProtectedArea: Boolean = false,
    private val protectedAreaInKm2: Double = 0.0
) {

    open fun formatDetails(): String {
        val protegido = if (hasProtectedArea) "Sim" else "Não"
        return "Nome: $name, Protegido: $protegido, Área Protegida: $protectedAreaInKm2 km²"
    }

    override fun toString(): String = formatDetails()
}

