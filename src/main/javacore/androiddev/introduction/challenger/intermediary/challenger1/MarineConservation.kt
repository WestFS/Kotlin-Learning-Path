
class MarineConservation(
    var tipoAmbiente: String? = null,
    var areaProtegida: Double? = null
) {
    private var possuiMonitoramento: Boolean = false

    init {
        println("CONSERVAÇÃO MARINHA INICIADA")
        checkMonitoramento()
        println("__________________________________")
    }

    constructor(tipoAmbiente: String, areaProtegida: Double, possuiMonitoramento: Boolean) : this()

    fun checkMonitoramento() {
        if (areaProtegida != null && areaProtegida!! <= 100 && !possuiMonitoramento) {
            println("Você não tem monitoramento no seu $tipoAmbiente, e também não precisa já que possui apenas $areaProtegida")
        } else if (possuiMonitoramento == true) {
            println("Você já tem monitoramento no seu $tipoAmbiente")
        } else {
            println("Você já tem monitoramento ${possuiMonitoramento}")
        }
    }

    override fun toString(): String {
        return "MarineConservation(tipoAmbiente= $tipoAmbiente," +
                " areaProtegida= $areaProtegida," +
                " possuiMonitoramento= $possuiMonitoramento," +
                " areaProtegida= $_areaProtegida)"
    }

    var _areaProtegida: Double? = areaProtegida
        get() {
            return field
        }
        set(value) {
            field = value
        }


}
