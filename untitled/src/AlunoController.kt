/**
 Controller deve receber serviços e não repositõrios via injeção de pedendências
 Controller recebe os dados
  **/

class AlunoController (
    private val alunoService: AlunoService
) {
    fun cadastrarAluno(id: String, nome: String, idade: Int, curso: String, nota: Double) {
        val aluno = Aluno(
            id = id,
            nome = nome,
            idade = idade,
            curso = curso,
            nota = nota
        )
        alunoService.cadastrarAluno(aluno)

    }

    fun listarAlunos() {

        val alunos = alunoService.listarAlunos()
        if (alunos.isEmpty()) {
            println("Nenhum aluno cadastrado")
        } else {
            println("Lista de alunos:")
            alunos.forEach { it.exibirDados() }
            println("Total de alunos: ${alunos.size}")
        }
    }

    fun buscarAlunoPorNome(nome: String) {
        val aluno = alunoService.buscarAlunoPorNome(nome)
        if (aluno != null) {
            println("Aluno encontrado:")
            aluno.exibirDados()
        } else {
            println("Aluno com nome=${nome} não encontrado.")
        }
    }

    fun buscarAlunoPorId(id: String) {
        val aluno = alunoService.buscarAlunoPorid(id)
        if (aluno != null) {
            println("Aluno encontrado")
            aluno.exibirDados()
        } else {
            println("Aluno com o id ${id} não encontrado")
        }
    }

    fun alterarAlunoPorId(id: String, nome: String, idade: Int, curso: String, nota: Double) {
        val aluno = Aluno(
          id, nome, idade, curso, nota
        )
        alunoService.alterarAlunoPorId(aluno)
    }

    fun removerAluno(nome: String) {
        val removido = alunoService.removerAluno(nome)
        if (removido) {
            println("Aluno $nome removido com sucesso!")
        } else {
            println("Não foi possível remover. Aluno $nome não encontrado.")
        }
    }


}




