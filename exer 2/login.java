import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";

System.out.println("Escolha um nome de usuário:");
        username = scanner.nextLine();
        while (username.isEmpty()) {
            System.out.println("Erro: informação invalida. Tente de novo.");
            username = scanner.nextLine();
        }

        System.out.println("Coloque uma senha valida:");
        password = scanner.nextLine();
        while (username.equals(password)) {
            System.out.println("Erro: senha não pode ser igual ao nome. Tente de novo.\nsenha:");
            password = scanner.nextLine();
        }

        System.out.println("Obrigado por informar nome de usuário e senha validos.");

        scanner.close();
    }
}