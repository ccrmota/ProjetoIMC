package br.cicero.brq.Model

class Carro( val nome: String,
             val ano: Int,
             val cor: String
) {

    fun acelerar () {
        println("$nome acelerando....")

    }

    private fun frear(){
        println("$nome parando....")

    }

    fun buscaDescricaoCompleta() : String {

        frear()
        return "$nome $ano  $cor"
    }


}