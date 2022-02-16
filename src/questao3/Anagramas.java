package questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagramas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com a palavra: ");
		String palavra = scan.nextLine();
		System.out.println(ValidacaoString.validarAnagrama(palavra));
	}
}
