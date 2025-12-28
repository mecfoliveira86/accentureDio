import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Tabuada - Selecione um número para que seja exibida uma tabuada do número que vc selecionar de 0 a 10");
        System.out.println("Indique um número");
        int number = sc.nextInt();
        int result = 0;
        for(var count = 0; count <= 10; count++){
            result = number * count;
            System.out.printf("%s X %s = %s \n", number, count, result);
        }
    }
}
