import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// n é a variável que representa o tamanho da escada
		int n = sc.nextInt();

		// A escada é uma matriz com n linhas e n colunas
		char[][] matriz = new char[n][n];

		// Construção da escada:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) <= (n - 2)) {
					matriz[i][j] = ' ';
				} 
				else {
					matriz[i][j] = '*';
				}
			}
		}

		// Saída:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

		sc.close();

	}
}
