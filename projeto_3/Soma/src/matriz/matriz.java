package matriz;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação de uma matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Variável para armazenar a soma dos elementos
        int soma = 0;

        // Solicitar ao usuário que entre com os valores da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt(); // Lê um inteiro e o armazena na matriz
            }
        }

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();

        // Calcular a soma dos elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        // Exibir a soma dos elementos
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}
