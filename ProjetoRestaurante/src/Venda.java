import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



class Venda {
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    // Construtor

    public Venda(Cliente cliente) {
        this.cliente = cliente;
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