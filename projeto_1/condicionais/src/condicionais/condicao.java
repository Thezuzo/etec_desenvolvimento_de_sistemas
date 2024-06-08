package condicionais;
import java.util.Scanner;

public class condicao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número final da placa do veículo (0 a 9): ");
		
		int finalPlaca = scanner.nextInt();
				
		if(finalPlaca >= 0 && finalPlaca<= 9) {
		switch(finalPlaca) {
		case 1:
			System.out.println("Pagamento até 30/04");
			break;
			
		case 2:
			System.out.println("Pagamento até 31/05");
			break;
			
		case 3:
			System.out.println("Pagamento até 30/06");
			break;
			
		case 4:
			System.out.println("Pagamento até 31/07");
			break;
			
		case 5:
			System.out.println("Pagamento até 31/08");
			break;
			
		case 6:
			System.out.println("Pagamento até 30/09");
			break;
			
		case 7:
			System.out.println("Pagamento até 31/10");
			break;
				
		case 8:
			System.out.println("Pagamento até 30/11");
			break;
			
		case 9:
			System.out.println("Pagamento até 31/12");
			break;
			
		case 0:
			System.out.println("Pagamento até 31/12");
			break;
		} 
		} else {
			 System.out.println("O valor digitado está incorreto. Por favor, digite um número de placa entre 0 e 9.");		
			
	}
		scanner.close();
}
}	