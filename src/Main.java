public class Main {

    public static void main(String[] args) {
        // Criação de um cliente e configuração do nome.
        Cliente Cesar = new Cliente();
        Cesar.setNome("César");

        // Criação de uma conta corrente e uma conta poupança para o cliente.
        Conta cc = new ContaCorrente(Cesar);
        Conta poupanca = new ContaPoupanca(Cesar);

        // Realiza um depósito de 100 unidades na conta corrente.
        cc.depositar(100);
        //cc.sacar(150);

        // Transfere 100 unidades da conta corrente para a conta poupança.
        cc.transferir(100, cc);

        // Imprime o extrato da conta corrente.
        System.out.println("\nExtrato da Conta Corrente:");
        cc.imprimirExtrato();

        // Imprime o extrato da conta poupança.
        System.out.println("\nExtrato da Conta Poupança:");
        poupanca.imprimirExtrato();
    }
}
