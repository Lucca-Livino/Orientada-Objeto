class AlunoService (private val alunoRepository: AlunoRepository){
    fun cadastrarAluno(aluno: Aluno): Aluno{


        alunoRepository.cadastrarAluno(aluno)
        return aluno
    }

    fun listarAlunos(): List<Aluno>{
        return alunoRepository.listarAlunos()
    }

    fun buscarAlunoPorid(id: String): Aluno? {
        return alunoRepository.buscarPorId(id)
    }

    fun buscarAlunoPorNome(nome: String): Aluno? {
        return alunoRepository.buscarPorNome(nome)
    }

    fun removerAluno(nome: String): Boolean {
        val aluno = alunoRepository.buscarPorNome(nome)
        return if (aluno != null) {
            alunoRepository.remover(aluno)
            true
        } else {
            false
        }
    }


    fun alterarAlunoPorId(aluno: Aluno): Aluno{
        alunoRepository.atualizarAluno(aluno)
        return aluno
    }

}