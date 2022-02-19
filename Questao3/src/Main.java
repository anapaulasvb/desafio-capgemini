import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantidadeDeAnagramas = 0;

		String entrada = sc.nextLine();
		
		// Percorrendo a string para comparar todas as combinações possíveis:
		for (int y = 1; y <= entrada.length(); y++) {

			for (int x = 0; x <= entrada.length() - y; x++) {
				
				char[] array1 = entrada.substring(x, y + x).toCharArray();

				for (int i = x + 1; i <= entrada.length() - y; i++) {

					char[] array2 = entrada.substring(i, y + i).toCharArray();

					if (verificarAnagrama(array1, array2)) {
						quantidadeDeAnagramas++;
						/*
						 * Para imprimir os pares de anagramas: 
						 * System.out.print(entrada.substring(x, y+x)); 
						 * System.out.print(" = "); 
						 * System.out.println(entrada.substring(i, y+i));
						 */
					}
				}
			}
		}

		System.out.println(quantidadeDeAnagramas);
		sc.close();
	
	}

	private static boolean verificarAnagrama(char[] array1, char[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
