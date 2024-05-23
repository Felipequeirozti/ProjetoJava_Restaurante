import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
    }

}