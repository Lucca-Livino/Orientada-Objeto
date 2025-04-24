class AlunoRepository {
    private val alunos = mutableListOf<Aluno>()

    fun cadastrarAluno(aluno: Aluno){
        alunos.add(aluno)
        println("Aluno: ${aluno.nome} cadastrado com sucesso!")
    }

    fun listarAlunos(): List<Aluno>{
        return alunos
    }

    fun buscarPorId(id: String): Aluno? {
        return alunos.find{it.id == id}
    }

    fun buscarPorNome(nome:String): Aluno? {
        val aluno = alunos.find { it.nome == nome }
        return aluno
    }

    fun remover(aluno: Aluno) {
        alunos.remove(aluno)
        println("Aluno ${aluno.nome} removido com sucesso!")
    }


    fun atualizarAluno(aluno: Aluno){
        val alunoRemover = alunos.find { it.id == aluno.id}

        if (alunoRemover == null){
            println("Nenhum aluno com o id ${aluno.id} encontrado")
        }else {
            alunos.remove(alunoRemover)
            alunos.add(aluno)
        }
    }
}