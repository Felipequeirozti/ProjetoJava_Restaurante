import java.util.ArrayList;

// Classe para gerenciar os clientes

class GerenciadorClientes {
    private ArrayList<Cliente> clientes;

    // Construtor

    public GerenciadorClientes() {
        this.clientes = new ArrayList<>();
    }

    // Método para cadastrar cliente

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para validar cliente

    public boolean validarCliente(String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefone().equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    // Método para listar clientes

    public void listarClientes() {
        System.out.println("Clientes Cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", Telefone: " + cliente.getTelefone());
        }
    }

    // Método para pesquisar cliente por telefone

    public Cliente pesquisarClientePorTelefone(String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefone().equals(telefone)) {
                return cliente;
            }
        }
        return null;
    }
}