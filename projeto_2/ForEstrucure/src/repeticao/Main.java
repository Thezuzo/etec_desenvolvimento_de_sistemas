package repeticao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int contagemExcelente = 0;
        int contagemRuim = 0;

        // para fins de teste, ajustamos o loop para 10. Para 50 entrevistados, altere para (int i = 1; i <= 50; i++)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevistado #" + i);
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Qual sua opinião sobre o atendimento prestado?");
            System.out.println("1 - EXCELENTE");
            System.out.println("2 - BOM");
            System.out.println("3 - RUIM");
            System.out.print("Escolha uma opção (1, 2, 3): ");
            int opiniao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do teclado

            // verifica a opinião e incrementa o contador correspondente
            if (opiniao == 1) {
                contagemExcelente++;
            } else if (opiniao == 3) {
                contagemRuim++;
            }

            System.out.println(); // Linha em branco para melhor visualização
        }

        // exibi resultados
        System.out.println("Resultado da pesquisa:");
        System.out.println("Respostas 'EXCELENTE': " + contagemExcelente);
        System.out.println("Respostas 'RUIM': " + contagemRuim);
    }
}

