import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    // Construtor que inicializa a lista de contas
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>(); // Inicializa a lista para evitar null
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Método para encontrar uma conta pelo número
    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Método para encontrar contas por cliente
    public List<Conta> buscarContasPorCliente(String nomeCliente) {
        List<Conta> contasDoCliente = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                contasDoCliente.add(conta);
            }
        }
        return contasDoCliente;
    }
}