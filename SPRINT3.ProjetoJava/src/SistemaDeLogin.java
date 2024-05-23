import java.util.HashMap;
import java.util.Map;

class SistemaDeLogin implements Autenticavel {
    private Map<String, String> credenciais;

    // Construtor

    public SistemaDeLogin() {
        this.credenciais = new HashMap<>();
    }

    // Método para cadastrar login e senha

    public void cadastrarCredencial(String usuario, String senha) {
        credenciais.put(usuario, senha);
    }

    // Método para validar login

    public boolean validarLogin(String usuario, String senha) {
        return credenciais.containsKey(usuario) && credenciais.get(usuario).equals(senha);

    }
}