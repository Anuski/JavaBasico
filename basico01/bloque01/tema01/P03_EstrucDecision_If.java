package tema01;

import java.util.Scanner;

public class P03_EstrucDecision_If {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuál es su edad?");
		int edad = scanner.nextInt();

		if (edad >= 18) {
			System.out.println("Es usted mayor de edad!");
		} else {
			System.out.println("Eres menor de edad!");
		}
	}

}
