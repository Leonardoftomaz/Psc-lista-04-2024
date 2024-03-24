import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Informe as informações para os países A e B:");

            int popA = 0;
            double taxaCrescimentoA = 0.0;
            while (popA <= 0) {
                System.out.print("Informe a população inicial do país A (maior que 0): ");
                popA = scanner.nextInt();
                if (popA <= 0) {
                    System.out.println("População inválida. A população deve ser maior que 0.");
                }
            }
            while (taxaCrescimentoA <= 0) {
                System.out.print("Informe a taxa de crescimento anual do país A (como decimal, maior que 0): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("Taxa de crescimento inválida. A taxa deve ser maior que 0.");
                }
            }

            int popB = 0;
            double taxaCrescimentoB = 0.0;
            while (popB <= 0) {
                System.out.print("Informe a população inicial do país B (maior que 0): ");
                popB = scanner.nextInt();
                if (popB <= 0) {
                    System.out.println("População inválida. A população deve ser maior que 0.");
                }
            }
            while (taxaCrescimentoB <= 0) {
                System.out.print("Informe a taxa de crescimento anual do país B (como decimal, maior que 0): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("Taxa de crescimento inválida. A taxa deve ser maior que 0.");
                }
            }

            int anos = 0;

            while (popA <= popB) {
                popA += popA * taxaCrescimentoA;
                popB += popB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a do país B.");

            System.out.print("Deseja repetir a operação? (s/n): ");
            String repetir = scanner.next();
            if (!repetir.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}
