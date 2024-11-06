/**
 * Representa uma conta poupança que estende a classe base Conta.
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor que inicializa a ContaPoupanca com um cliente específico.
     *
     * @param cliente O cliente associado a esta conta poupança.
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    /**
     * Imprime o extrato da conta poupança com detalhes comuns da conta.
     * Sobrescreve o método imprimirExtrato da classe base.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");

        // Chama o método da superclasse para imprimir as informações comuns da conta.
        try {
            super.imprimirInfosComuns();
        } catch (Exception e) {
            System.err.println("Erro ao imprimir as informações da conta: " + e.getMessage());
        }
    }
}
