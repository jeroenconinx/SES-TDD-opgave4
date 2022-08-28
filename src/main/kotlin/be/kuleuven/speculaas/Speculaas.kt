package be.kuleuven.speculaas

data class Speculaas(val boter: Int = 0, val suiker: Int = 0, val kruiden: Int = 0, val bloem: Int = 0, val eieren: Int = 0, val melk: Int = 0, val honing: Int = 0){



    fun beoordeel(): Int {

        var score = 2*boter + 2*suiker + kruiden + bloem + eieren + melk + honing

        if(kruiden==0 || honing==0){
            score= 5
        }

        if(bloem==0 || eieren==0 || melk==0){
            score= 1
        }

        if(boter==0 || suiker==0){
            score = 0
        }

        return score

        }


}