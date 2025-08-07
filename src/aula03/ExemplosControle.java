package aula03;

import java.util.Scanner;

public class ExemplosControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. IF simples – controle de acesso por idade
        System.out.println("Exemplo - IF simples – controle de acesso por idade ");
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso permitido.");
        }

        // 2. IF-ELSE – verificação de idade
        System.out.println("\nExemplo - IF-ELSE – verificação de idade");
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // 3. IF-ELSE encadeado – classificação por idade
        System.out.println("\nExemplo - IF-ELSE encadeado – classificação por idade");
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        // 4. SWITCH – escolha de pedido
        System.out.println("\nExemplo - SWITCH – escolha de pedido");
        System.out.println("Escolha um item do menu:");
        System.out.println("1. Café");
        System.out.println("2. Sorvete");
        System.out.println("3. Chá");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu café.");
                break;
            case 2:
                System.out.println("Você escolheu sorvete.");
                break;
            case 3:
                System.out.println("Você escolheu chá.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // 5. Operadores relacionais e lógicos
        System.out.println("\nExemplo - Operadores relacionais e lógicos");
        int a = 10;
        int b = 20;
        boolean resultado = (a < b) && (b > 15);
        System.out.println("Resultado da expressão (a < b && b > 15): " + resultado);

        // 6. WHILE – contagem de 1 a 5
        System.out.println("\nExemplo - IF simples – controle de acesso por idade");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador (while): " + contador);
            contador++;
        }

        // 7. DO-WHILE – senha até acertar
        System.out.println("\nExemplo - DO-WHILE – senha até acertar");
        int senha;
        do {
            System.out.print("Digite a senha (1234): ");
            senha = scanner.nextInt();
        } while (senha != 1234);
        System.out.println("Senha correta.");

        // 8. FOR – tabuada de multiplicação do 5
        System.out.println("\nExemplo - FOR – tabuada de multiplicação do 5");
        System.out.println("Tabuada do 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // 9. Mini desafio – sistema de pedido com laço
        System.out.println("\nExemplo - Mini desafio – sistema de pedido com laço");
        char continuar;
        do {
            System.out.println("Menu:");
            System.out.println("1. Café");
            System.out.println("2. Sorvete");
            System.out.println("3. Suco");
            System.out.print("Escolha um produto: ");
            int item = scanner.nextInt();

            switch (item) {
                case 1:
                    System.out.println("Café adicionado ao pedido.");
                    break;
                case 2:
                    System.out.println("Sorvete adicionado ao pedido.");
                    break;
                case 3:
                    System.out.println("Suco adicionado ao pedido.");
                    break;
                default:
                    System.out.println("Produto não disponível.");
            }

            System.out.print("Deseja adicionar outro item? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Pedido finalizado. Obrigado!");

        scanner.close();
    }
}
