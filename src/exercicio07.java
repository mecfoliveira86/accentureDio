import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v1, v2, option;
        boolean evaluator = true;

        while(evaluator){
            System.out.println("Informe um número inteiro qualquer: ");
            v1 = sc.nextInt();

            System.out.println("Informe um número inteiro maior que o primeiro: ");
            v2 = sc.nextInt();

            System.out.println("Informe se deseja números pares(0) ou ímpares (1):");
            option = sc.nextInt();

            if (v1 < v2 && (option == 0 || option == 1)) {
                for (int x = v2; x >= v1; x--) {
                    if (x % 2 == option) {
                        String tipo = (x % 2 == 0) ? "par" : "ímpar";
                        System.out.printf("%d é número %s\n", x, tipo);
                    }
                }
                evaluator = false;
            } else {
                System.out.println("O valores digitados não obedeceram a regra solicitada!");
            }
        }
    }
}