package fundamentos;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a letra:");
		char letra = entrada.next().charAt(0);
		
		
		if (letra == 'f') {
			System.out.println("Feminino");
			
		}else {
			System.out.println("Masculino");
		}
	}

}
