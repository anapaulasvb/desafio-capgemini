import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String senha = sc.nextLine();

		System.out.println(encontrarMinimoDeCaracteres(senha));
		
		sc.close();

	}
	
	
	private static int encontrarMinimoDeCaracteres(String senha) {
		
		int digito = 0;
		int letraEmMinusculo = 0;
		int letraEmMaiusculo = 0;
		int caractereEspecial = 0;
		int numeroMinimoDeCaracteres = 0;
		
		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
				digito++;
			} 
			else if (senha.charAt(i) >= 'a' && senha.charAt(i) <='z') {
				letraEmMinusculo++;
			} 
			else if (senha.charAt(i) >= 'A' && senha.charAt(i) <='Z') {
				letraEmMaiusculo++;
			} 
			else if (caractereEspecial(senha.charAt(i))) {
				caractereEspecial++;
			}
		}
			
		if (digito == 0) {
			numeroMinimoDeCaracteres ++;
		}
		
		if (letraEmMinusculo == 0) {
			numeroMinimoDeCaracteres ++;
		}
		
		if (letraEmMaiusculo == 0) {
			numeroMinimoDeCaracteres ++;
		}
		
		if (caractereEspecial == 0) {
			numeroMinimoDeCaracteres ++;
		}
		
		if (senha.length() + numeroMinimoDeCaracteres < 6) {
			numeroMinimoDeCaracteres = 6 - senha.length();
		}
		
		return numeroMinimoDeCaracteres;
		
	}
	
	private static boolean caractereEspecial (char caractereEspecial) {
		if (caractereEspecial == '!' 
			|| caractereEspecial == '@' 
			|| caractereEspecial == '#'
			|| caractereEspecial == '$'
			|| caractereEspecial == '%'
			|| caractereEspecial == '^'
			|| caractereEspecial == '&'
			|| caractereEspecial == '*'
			|| caractereEspecial == '('
			|| caractereEspecial == ')'
			|| caractereEspecial == '-'
			|| caractereEspecial == '+') {
			return true;
		}
		else {
			return false;
		}
	}
}
