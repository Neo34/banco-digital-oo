/**
 * Interface que representa operações básicas de uma conta bancária.
 */
public interface IConta {

    /**
     * Realiza o saque de um valor específico da conta.
     *
     * @param valor O valor a ser sacado.
     * @throws IllegalArgumentException Se o valor for negativo ou maior que o saldo disponível.
     */
    void sacar(double valor);

    /**
     * Realiza o depósito de um valor específico na conta.
     *
     * @param valor O valor a ser depositado.
     * @throws IllegalArgumentException Se o valor for negativo.
     */
    void depositar(double valor);

    /**
     * Transfere um valor para outra conta especificada.
     *
     * @param valor        O valor a ser transferido.
     * @param contaDestino A conta que receberá a transferência.
     * @throws IllegalArgumentException Se o valor for negativo ou maior que o saldo disponível.
     * @throws NullPointerException     Se a conta de destino for nula.
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta, mostrando transações e saldo atual.
     */
    void imprimirExtrato();
}
