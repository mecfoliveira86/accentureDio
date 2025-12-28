import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de área e perímetro de retângulo");
        System.out.println("Insira o valor da base:");
        int base = sc.nextInt();
        System.out.println("Insira o valor da altura:");
        int side = sc.nextInt();

        int area = base * side;
        int perimeter = base * 2 + side * 2;

        System.out.printf("Área igual a %s | Perímetro igual a %s", area, perimeter);
    }
}
