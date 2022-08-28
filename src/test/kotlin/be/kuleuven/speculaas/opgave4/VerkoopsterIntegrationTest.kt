package be.kuleuven.speculaas.opgave4

import be.kuleuven.speculaas.Speculaas
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mockito
import org.mockito.Mockito.mock

class VerkoopsterIntegrationTest {

    @Test
    fun erIsGeenKortingWanneerMinderDanZesSpeculazen()
    {
        val speculaas = mock(SpeculaasFabriek::class.java)
        val verkoopster = Verkoopster(speculaas)
        Mockito.`when`(speculaas.bak()).thenReturn(arrayListOf(Speculaas(), Speculaas(), Speculaas(), Speculaas(), Speculaas()))
        val resultaat = verkoopster.verkoop()
        MatcherAssert.assertThat(resultaat, CoreMatchers.`is`(10.0))
    }

    @Test
    fun erIsKortingWanneerMeerDan5StuksVerkochtWorden(){
        val speculaas = mock(SpeculaasFabriek::class.java)
        val verkoopster = Verkoopster(speculaas)
        Mockito.`when`(speculaas.bak()).thenReturn(arrayListOf(Speculaas(), Speculaas(), Speculaas(), Speculaas(), Speculaas(), Speculaas()))
        val resultaat = verkoopster.verkoop()
        val juistePrijs = 6*2.0*0.9
        MatcherAssert.assertThat(resultaat, CoreMatchers.`is`(juistePrijs))
    }

    @Test
    fun erWordtNiksVerkocht(){
        val speculaas = mock(SpeculaasFabriek::class.java)
        val verkoopster = Verkoopster(speculaas)
        Mockito.`when`(speculaas.bak()).thenReturn(arrayListOf())
        val resultaat = verkoopster.verkoop()
        MatcherAssert.assertThat(resultaat, CoreMatchers.`is`(0.0))
    }

}