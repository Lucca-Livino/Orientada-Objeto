open internal class Conta (
    val numeroConta: String,
    val titular: Cliente,
    val limite_extra: Double = 0.0
) {
    private var limite: Double = 0.0
    private var saldo: Double = 0.0

    open fun depositar(valor:Double){
        if (valor > 0){
            saldo += valor
        }
    }
}