import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gerenciador de clientes

        GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();

        // Cadastro de cliente

        System.out.println("Cadastro de Cliente:");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Telefone: ");

        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, telefoneCliente);

        gerenciadorClientes.cadastrarCliente(cliente);

        // Listar clientes

        gerenciadorClientes.listarClientes();

        // Pesquisar cliente por telefone

        System.out.println("\nPesquisar Cliente por Telefone:");
        System.out.print("Telefone: ");

        String telefonePesquisa = scanner.nextLine();

        Cliente clientePesquisado = gerenciadorClientes.pesquisarClientePorTelefone(telefonePesquisa);

        if (clientePesquisado != null) {
            System.out.println("Cliente encontrado - Nome: " + clientePesquisado.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}