public class App {
    public static void main(String[] args) {
        int popA = 80000;
        double taxaCrescimentoA = 0.03;
        int popB = 200000;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (popA <= popB) {
            popA += popA * taxaCrescimentoA;
            popB += popB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população do país A ultrapassar ou igualar a do país B.");
    }
}
