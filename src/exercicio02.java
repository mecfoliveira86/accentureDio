import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cálculo de área do quadrado");
        System.out.println("Insira o lado do quadrado:");
        int length = scan.nextInt();
        int area = length * length;

        System.out.printf("A área do quadrado é %s", area);
    }
}
