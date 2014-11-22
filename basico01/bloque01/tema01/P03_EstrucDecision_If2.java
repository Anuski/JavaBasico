package tema01;

import java.util.Scanner;

public class P03_EstrucDecision_If {

	public static void main(String[] args) {

		int num;
		int resto;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime un número:");
		num = scanner.nextInt();
		resto=num%2;
		
		// Utilizamos "==" para comparación
		//"=" es para asignación
		
		if (resto ==2) {
			System.out.println(num+" es par!");
		} else {
			System.out.println(num+" es impar!");
		}
	}

}
