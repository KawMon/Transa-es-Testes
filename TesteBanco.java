// Teste transações em java

import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args){
        String nome = "Gabriel Ferreira";
        double saldo = 2000.30;
        int opcao = 0;

        System.out.println ("-------------------------");
        System.out.println ("Nome do cliente: " + nome);
        System.out.println ("Saldo atual: " + saldo);
        System.out.println ("-------------------------");

        String menu = """ 
            Gostaria de realizar qual função? Digite o numero da função desejada!
               1 - Verificar saldo
               2 - Sacar
               3 - Depositar
               4 - Sair """;

        Scanner leitor = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println ("O saldo atual é: " + saldo);
            }
            else if (opcao == 2){
                System.out.println ("Quanto gostaria de Sacar? ");
                double valor = leitor.nextDouble();
                if (valor > saldo){
                    System.out.print ("Saldo insuficiente.");
                }
                 else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Quando gostaria de Depositar? ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("O saldo atual é: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção invalida.");
            }
        }

        leitor.close(); // fechar Scanner
     }
}