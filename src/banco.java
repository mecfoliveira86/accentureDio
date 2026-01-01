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
        
        boolean evaluator = true;
        int menu;
        
        Account a1 = new Account("Felipe", 550);    
        
        do  {
            System.out.println("\n------------------------------------");
            System.out.println("Menu do Banco");
            System.out.println("Selecione as opções");
            System.out.println("(1) - Consultar Saldo");
            System.out.println("(2) - Consultar cheque especial");
            System.out.println("(3) - Depositar dinheiro");
            System.out.println("(4) - Sacar dinheiro");
            System.out.println("(5) - Pagar um boleto");
            System.out.println("(6) - Consultar cheque especial");
            System.out.println("(0) - Fechar");
            System.out.println("-----------------------------------");
            System.out.println("Digite a opção que deseja realizar:");
            menu = sc.nextInt();
            
            System.out.printf("Você escolheu a opção: %s\n1", menu);
            
            
            switch (menu) {
                case 0 -> evaluator = false;
                case 1 -> System.out.println("\n" + a1.saldo());
                case 2 -> System.out.println("\n" + a1.chequeEspecial());
                case 3 -> {
                    System.out.println("Qual o valor deseja depositar?");
                    int deposito = sc.nextInt();
                    a1.deposit(deposito);
                }
                case 4 -> {
                    System.out.println("Qual o valor deseja sacar?");
                    int saque = sc.nextInt();
                    System.out.println(a1.withdraw(saque));
                }
                case 5 -> {
                    System.out.println("Qual o valor do boleto?");
                    int boleto = sc.nextInt();
                    System.out.println(a1.payBill(boleto));
                }
                 case 6 -> System.out.println("\n" + a1.chequeEspecial());
                 case 7 -> System.out.println("\n" + a1.consultSpecialValue());
                default -> System.out.println("Opção inválida");
            }

        } while(evaluator);

        sc.close();
    }
}