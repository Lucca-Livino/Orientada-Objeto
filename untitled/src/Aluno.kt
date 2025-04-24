import java.util.UUID
import javax.print.DocFlavor.STRING

class Aluno (val id:String, val nome:String, val idade: Int, val curso: String, val nota: Double){
    fun exibirDados(){
        println("ID: $id")
        println("Nome: $nome")
        println("Idade: $idade")
        println("Curso: $curso")
        println("Nota: $nota")


    }


companion object{
    fun getIdUnico(): String {
        return java.util.UUID.randomUUID().toString()
    }
    }
}