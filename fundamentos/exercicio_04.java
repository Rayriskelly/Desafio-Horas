package fundamentos;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero:");
		int num3 = entrada.nextInt();
		
		if (num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1);
			}
			else {
				System.out.println(num3);
			}
		}else {
			if(num2 > num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}

		
		}
		
	}


