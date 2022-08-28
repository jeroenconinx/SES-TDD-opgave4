package be.kuleuven.speculaas.opgave4

class Verkoopster(val fabriek: SpeculaasFabriek) {

    fun verkoop(): Double {
        val gebakken = fabriek.bak()
        if(gebakken.size > 5) {
            return (gebakken.size*(2.0))*0.9
        }
        return (gebakken.size * (2.0))
    }
}