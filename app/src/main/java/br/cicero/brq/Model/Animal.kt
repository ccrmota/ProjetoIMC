package br.cicero.brq.Model

 open class Animal(

    val nome: String,
    val endereco: String,
    val idade: Int,
    val numeroRegistro: Int


)  {

   open fun cadastroVacina() {
        println("")

    }

    open fun cadastroRegistro(){
        println("")

    }
}