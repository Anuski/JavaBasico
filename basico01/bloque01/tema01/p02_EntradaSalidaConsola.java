package tema01;

import java.util.Scanner;

public class p02_EntradaSalidaConsola {

	public static void main(String[] args) {
		
		// Para leer datos por teclado usamos la clase Scanner
		Scanner scanner = new Scanner(System.in);

		// Pedimos al usuario que escriba su nombre
		// Se utiliza println si queremos que añada un salto de linea
		// Print sin salto de linea
		System.out.println("Escriba su nombre: ");

		// Leemos el valor metido por teclado y se lo damos a "nombre"
		String nombre = scanner.nextLine(); // Es un String

		System.out.println("Escriba su edad: ");
		int edad = scanner.nextInt(); // Es un entero

		System.out.println("Escriba su estatura (con , para los decimales): ");
		double estatura = scanner.nextDouble(); // Es un double

		// Lo sacamos por pantalla
		System.out.println("Hola " + nombre + "!");
		System.out.println("Tienes " + edad + "años y mides " + estatura);


	}

}
