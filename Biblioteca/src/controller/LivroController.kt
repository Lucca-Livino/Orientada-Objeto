package controller

import model.Livro
import service.LivroService

class LivroController(private val livroService: LivroService) {

    fun cadastrarLivro(titulo: String, isbn: String, autor: Autor){
        val livro = Livro(titulo,isbn,autor)
        livroService.cadastrarLivro(livro)
        println("model.Aluno cadastrado com sucesso!")
    }

    fun listarLivros(){
        val livros = livroService.listarLivros()
        if (livros.isEmpty()){
            println("Nenhum livro Cadastrado")
        }else {
            println("---- Lista de Livros ----")
            livros.forEach{ it.exibirDados() }
            println("-------------------------")
        }
    }

}