import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
    }

}