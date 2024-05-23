import java.util.ArrayList;

class Venda {

    private ArrayList<Produto> produtos;

    // Construtor

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar produto na venda

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para listar os produtos da venda

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}