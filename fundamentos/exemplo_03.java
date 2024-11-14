package fundamentos;

import java.util.Scanner;

public class exemplo_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		
		int resp = entrada.nextInt();
		System.out.println(resp);
		

		if(resp >= 1) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		

	}

}
