import java.util.Objects;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(Objects.requireNonNull(cliente, "Cliente não pode ser nulo"));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}