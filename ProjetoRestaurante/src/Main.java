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

        // Gerenciador de produtos
        GerenciadorProdutos gerenciadorProdutos = new GerenciadorProdutos();

        // Cadastro de produto
        System.out.println("\nCadastro de Produto:");
        System.out.print("Nome: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Preço: ");
        double precoProduto = scanner.nextDouble();
        System.out.print("Disponível (true/false): ");
        boolean disponivelProduto = scanner.nextBoolean();
        Produto produto = new Produto(nomeProduto, precoProduto, disponivelProduto);
        gerenciadorProdutos.cadastrarProduto(produto);

        // Listar produtos
        gerenciadorProdutos.listarProdutos();

        // Verificar disponibilidade do produto
        System.out.println("\nVerificar Disponibilidade do Produto:");
        System.out.print("Nome do Produto: ");
        String nomeProdutoVerificar = scanner.next();
        boolean disponibilidade = gerenciadorProdutos.verificarDisponibilidade(nomeProdutoVerificar);
        if (disponibilidade) {
            System.out.println("Produto disponível.");
        } else {
            System.out.println("Produto indisponível.");
        }

        // Exibir valores dos produtos
        gerenciadorProdutos.exibirValoresProdutos();

        // Cadastro de login
        SistemaDeLogin sistemaDeLogin = new SistemaDeLogin();
        sistemaDeLogin.cadastrarCredencial("admin", "admin");

        // Validar login
        System.out.println("\nLogin:");
        System.out.print("Usuário: ");
        String usuario = scanner.next();
        System.out.print("Senha: ");
        String senha = scanner.next();
        if (sistemaDeLogin.validarLogin(usuario, senha)) {
            System.out.println("Login válido.");
        } else {
            System.out.println("Login inválido.");
        }

        // Cadastro de venda
        Venda venda = new Venda(cliente);
        venda.adicionarProduto(produto);

        // Listar produtos da venda
        System.out.println("\nProdutos da Venda:");
        venda.listarProdutos();
    }
}