import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade = 0;
        double salario = 0;
        char sexo = '0';
        char estadoCivil = '0';

        System.out.println("Digite um nome válido (mínimo 3 caracteres):");
        nome = scanner.nextLine();
        while (nome.length() < 3) {
            System.out.println("Erro: Nome inválido. Deve ter no mínimo 3 caracteres. Tente novamente.");
            nome = scanner.nextLine();
        }

        System.out.println("Digite uma idade válida (entre 0 e 150):");
        idade = scanner.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Erro: Idade inválida. Deve estar entre 0 e 150. Tente novamente.");
            idade = scanner.nextInt();
        }

        System.out.println("Digite um salário válido (maior que 0):");
        salario = scanner.nextDouble();
        while (salario <= 0) {
            System.out.println("Erro: Salário inválido. Deve ser maior que 0. Tente novamente.");
            salario = scanner.nextDouble();
        }

        System.out.println("Digite um sexo válido (f ou m):");
        sexo = scanner.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Erro: Sexo inválido. Deve ser 'f' ou 'm'. Tente novamente.");
            sexo = scanner.next().charAt(0);
        }

        System.out.println("Digite um estado civil válido (s, c, v, d):");
        estadoCivil = scanner.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Erro: Estado civil inválido. Deve ser 's', 'c', 'v' ou 'd'. Tente novamente.");
            estadoCivil = scanner.next().charAt(0);
        }

        System.out.println("Obrigado por inserir informações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
