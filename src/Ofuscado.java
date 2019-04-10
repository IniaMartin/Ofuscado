 
import java.util.Scanner;

public class Ofuscado { 
	public static void print(String mensaje) {
		System.out.println(mensaje);
	}
	public static int factorial (int numero) {
		if (numero == 0) return 1;
		else{
			int factorial = 1;
			do {
				factorial *= numero;
				numero--; 
			} while(numero > 0);
			return factorial;
		} 
	}

	public static String palabraInversa(String palabra) {
		String inverso = "";
		int posicion = 0;
		do {
			inverso = palabra.charAt(posicion) + inverso;
			posicion++;
		} while (posicion < palabra.length());
		return palabra + inverso;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcionNum;
		do {
			opcionNum = imprimirMenu(teclado);
			if (opcionNum == 1) {
				print("Inserte un número:");
				print("El resultado es: "+ factorial(teclado.nextInt()));
			} else if (opcionNum == 2) {
					print("Inserte una palabra:");
					print("El resultado es: "+ palabraInversa(teclado.nextLine()));
			}
		} while (opcionNum != 3);
		teclado.close();
	}
	private static int imprimirMenu(Scanner teclado) {
		int opcionNum;
		print("BIENVENIDO AL PROGRAMA OFUSCADO");
		print("-------------------------------");
		print("Elija una opcion:");
		print("1) FACTORIAL");
		print("2) PALABRA PALINDROMA");
		print("3) SALIR");
		print(">");
		opcionNum = teclado.nextInt();
		teclado.nextLine();
		return opcionNum;
	}
}
