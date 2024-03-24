import java.util.Scanner;

public class notaZeroDez {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int note = -1;

            while (note < 0 || note > 10) {
                System.out.println("Informe um número de 0 a 10:");
                note = scanner.nextInt();
                if (note < 0 || note > 10) {
                    System.out.println("Número invalido. tente de novo");
                }
            }

            System.out.println("Obrigado por informar um número valido: " + note);
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
}