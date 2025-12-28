import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start_number, sequence, module;
        boolean evaluator = true;

        System.out.println("Informe o número inicial: ");
        start_number = sc.nextInt();

        while (evaluator) {
            System.out.println("Informe um outro número maior que o primeiro: ");
            sequence = sc.nextInt();

            if (sequence > start_number) {
                module = sequence % start_number;
                System.out.printf("%s %% %s = %s\n", sequence, start_number, module);
                if (module == 1) {
                    evaluator = false;
                }
            }
        }
    }
}