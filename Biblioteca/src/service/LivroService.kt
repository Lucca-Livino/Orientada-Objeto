package service

import model.Livro
import repository.LivroRepositorio

class LivroService (private val livroRepositorio: LivroRepositorio){
    fun cadastrarLivro(livro: Livro): Livro{
        livroRepositorio.adicionar(livro)
        return livro
    }

    fun listarLivros(): List<Livro> {
        return livroRepositorio.listarLivros()
    }
}