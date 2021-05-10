package br.cicero.brq.Model

abstract class Pessoa(
    override val email: String,
    override val senha: String

) : Users(email = "Jose@gmail.com",senha ="abc" ) {




}