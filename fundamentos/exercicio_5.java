package fundamentos;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero:");
		int num = entrada.nextInt();
		
		if (num == 1) {
			System.out.println("Domingo");}
			if (num == 2) {
				System.out.println("Segunda");}
				if (num == 3) {
					System.out.println("Terça");}
					if (num == 4) {
						System.out.println("Quarta");}
						if (num == 5) {
							System.out.println("Quinta");}
							if (num == 6) {
								System.out.println("Sexta");}
								if (num == 7) {
									System.out.println("Sábado");}
								
		else {
			System.out.println("Dia da semana inválido!");
		}

		}		
}
								
