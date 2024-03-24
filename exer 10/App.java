import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int min = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int max = scanner.nextInt();

        System.out.println("Os números inteiros no intervalo são:");

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        scanner.close();
    }
}
