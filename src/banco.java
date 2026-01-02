/*Todos os exercícios devem ter um menu interativo para chamar as funções e ter uma opção de sair para finalizar a execução:

1. Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:
a) Consultar Saldo
b) Consultar cheque especial
c) Depositar dinheiro
d) Sacar dinheiro
e) Pagar um boleto
f) Verifica se a conta está usando cheque especial

Siga as instruções para implementar

-A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
-O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
-Se o valor depositado na criação da conta for de R$ 500,00 ou menos o cheque especial deve ser de R$ 50,00
-Para valores acima de R$ 500,00, o cheque especial deve ser de 50% do valor depositado;
-Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial. */

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Criando a conta (Exemplo: R$ 600 gera R$ 300 de limite)
        Account a1 = new Account("Felipe", 600);    
        
        int menu;
        do {
            System.out.println("\n---------- MENU BANCÁRIO ----------");
            System.out.println("(1) Consultar Saldo");
            System.out.println("(2) Consultar Cheque Especial (Valores)");
            System.out.println("(3) Depositar Dinheiro");
            System.out.println("(4) Sacar Dinheiro");
            System.out.println("(5) Pagar um Boleto");
            System.out.println("(6) Verificar se está usando Cheque Especial");
            System.out.println("(0) Sair");
            System.out.print("Escolha: ");
            
            menu = sc.nextInt();
            
            switch (menu) {
                case 1 -> System.out.println(a1.saldo());
                case 2 -> System.out.println(a1.consultSpecialValue());
                case 3 -> {
                    System.out.print("Valor do depósito: ");
                    a1.deposit(sc.nextFloat());
                }
                case 4 -> {
                    System.out.print("Valor do saque: ");
                    System.out.println(a1.withdraw(sc.nextFloat()));
                }
                case 5 -> {
                    System.out.print("Valor do boleto: ");
                    System.out.println(a1.payBill(sc.nextFloat()));
                }
                case 6 -> System.out.println(a1.checkOverdraftUsage());
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (menu != 0);

        sc.close();
    }
}