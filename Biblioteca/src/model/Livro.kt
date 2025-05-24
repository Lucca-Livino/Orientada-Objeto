package model
import java.util.UUID

class Livro( val titulo: String, val isbn: String, val autor: Autor){

    fun exibirDados(){
        println("Titulo: $titulo")
        println("Isbn: $isbn")
        println("Autor: $autor")
    }

    companion object {
        fun gerarIdUnico(): String {
            return UUID.randomUUID().toString()
        }
    }


}