import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua altura (em metros): ");
        float height = sc.nextFloat();

        System.out.println("Insira seu peso (em  quilogramas - kg): ");
        float weight = sc.nextFloat();

        float imc = weight / (height * height);

        System.out.printf("Seu IMC é %s! \nClassificação: ", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc <= 24.9){
            System.out.println("Peso Ideal");
        } else if (imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II - Severa");
        } else {
            System.out.println("Obesidade Grau III - Mórbida");
        }
    }
}
