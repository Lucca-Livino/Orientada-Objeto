//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  //instâncias

    val alunoRepository = AlunoRepository()
    val alunoService = AlunoService(alunoRepository)
    val alunoController = AlunoController(alunoService)

    //simulação de cadastro

    alunoController.cadastrarAluno(
        id = "1",
        nome = "Lucca",
        idade = 21,
        curso = "Ads",
        nota = 10.0
    )

    alunoController.cadastrarAluno(
        id = Aluno.getIdUnico(),
        nome = "Aílton",
        idade = 20,
        curso = "Ads",
        nota = 10.0
    )


//
//    alunoController.buscarAlunoPorId("af4ccf8a-acdd-4bb4-9d29-3eab41e62b6c")
//
//    alunoController.buscarAlunoPorNome("Aílton")

    alunoController.alterarAlunoPorId(id = "1",
        nome = "Vinícius",
        idade = 19,
        curso = "Ads",
        nota = 10.0)

    //alunoController.deletarAluno()

    alunoController.listarAlunos()
}
