package be.kuleuven.speculaas.opgave4

import be.kuleuven.speculaas.Speculaas

interface SpeculaasFabriek {
    fun bak(): List<Speculaas>
}

class GoedeSpeculaasFabriek : SpeculaasFabriek {
    override fun bak(): List<Speculaas> {
        return arrayListOf(Speculaas(), Speculaas(), Speculaas(), Speculaas(), Speculaas())
    }
}