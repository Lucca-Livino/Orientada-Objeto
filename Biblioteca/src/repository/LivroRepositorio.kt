package repository

import model.Livro


class LivroRepositorio {
    private val livros = mutableListOf<Livro>()

    fun adicionar(livro: Livro){
        livros.add(livro)
        println("Livro ${livro.titulo} adicionado com sucesso!")
    }

    fun listarLivros(): List<Livro>{
        return livros
    }
}