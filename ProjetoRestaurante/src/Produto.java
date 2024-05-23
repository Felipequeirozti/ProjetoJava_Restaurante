class Produto extends Entidade {
    private double preco;
    private boolean disponivel;

    // Construtor
    public Produto(String nome, double preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    // Getters para preco e disponivel
    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}