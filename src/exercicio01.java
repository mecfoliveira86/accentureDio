import java.time.OffsetDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int currentYear = OffsetDateTime.now().getYear();

    System.out.println("Escreva o seu nome: ");
    String name = scan.nextLine();

    System.out.println("Insira o seu ano de nascimento: ");
    int userBorn = scan.nextInt();

    System.out.printf("Olá %s você tem %s anos! %n", name, currentYear - userBorn);
    }
}