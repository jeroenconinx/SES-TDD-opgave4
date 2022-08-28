package be.kuleuven.speculaas

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.CoreMatchers.`is` as Is

class SpeculaasTests {

    @Test
    fun maakNieuweSpeculaasAan_standaardZonderBoter() {
        val speculaas = Speculaas()
        assertTrue { speculaas.boter == 0 }
    }

    @Test
    fun `Maak nieuwe speculaas aan standaard zonder suiker`() {
        val speculaas = Speculaas()
        assertTrue { speculaas.suiker == 0 }
    }

    @Test
    fun `wanneer speculaas vies is zonder boter wordt score 0 gegeven` () {
        val speculaas1 = Speculaas(0,1,0,9,0,0,0)
        val resultaat = speculaas1.beoordeel()
        assertThat(resultaat, Is(0))
    }

    @Test
    fun `wanneer speculaas vies is zonder suiker wordt score 0 gegeven` () {
        val speculaas1 = Speculaas(1,0,0,9,0,0,0)
        val resultaat = speculaas1.beoordeel()
        assertThat(resultaat, Is(0))
    }

    @Test
    fun `wanneer geen basisingedienten bloem eiren of melk meegegeven dan score 1` () {
        val speculaas1 = Speculaas(9,9,9,0,9,9,9)
        val resultaat = speculaas1.beoordeel()
        assertThat(resultaat, Is(1))
    }

    @Test
    fun `wanneer geen kruiden of honing dan score 5` () {
        val speculaas1 = Speculaas(9,9,9,9,9,9,0)
        val resultaat = speculaas1.beoordeel()
        assertThat(resultaat, Is(5))
    }

}