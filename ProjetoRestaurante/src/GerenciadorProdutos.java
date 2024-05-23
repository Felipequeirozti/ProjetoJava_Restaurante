import java.util.ArrayList;

class GerenciadorProdutos {
    private ArrayList<Produto> produtos;

    // Construtor
    public GerenciadorProdutos() {
        this.produtos = new ArrayList<>();
    }

    // Método para cadastrar produto
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para verificar disponibilidade do produto
    public boolean verificarDisponibilidade(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto.isDisponivel();
            }
        }
        return false;
    }

    // Método para listar produtos
    public void listarProdutos() {
        System.out.println("Produtos Disponíveis:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }

    // Método para exibir valores de todos os produtos
    public void exibirValoresProdutos() {
        System.out.println("Valores dos Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}