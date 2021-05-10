package br.cicero.brq.Model

open class Users(
    open val email: String,
    open val senha: String
) {
    open fun validarEmail() {
        println()

    }

    open fun validarSenha() {
        println()

    }

}