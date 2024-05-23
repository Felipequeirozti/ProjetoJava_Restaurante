import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Cliente extends Entidade {
    private String telefone;

    // Construtor
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getter para telefone
    public String getTelefone() {
        return telefone;
    }
}