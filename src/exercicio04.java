import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade da primeira pessoa:");
        int p1 = sc.nextInt();
        System.out.println("Insira a idade da segunda pessoa:");
        int p2 = sc.nextInt();

        // Integer.compare retorna: -1 (se p1 < p2), 1 (se p1 > p2) ou 0 (se iguais)
        int comparison = Integer.compare(p1, p2);

        // Switch Expression (Java 17)
        String analysis = switch (comparison) {
            case -1 -> "A segunda pessoa é mais velha. Diferença: " + (p2 - p1) + " ano(s)!";
            case 1  -> "A primeira pessoa é mais velha. Diferença: " + (p1 - p2) + " ano(s)!";
            default -> "Pessoas têm a mesma idade";
        };

        System.out.printf("%s", analysis);
        sc.close();
    }
}