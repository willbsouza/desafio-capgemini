package questao1;

import java.util.Scanner;

public class Escada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor para n: ");
		Integer n = scan.nextInt();
		Integer aux = 0;
		for(int i = 1; i <= n; i++) {
			aux = n - i;
			for(int j = 1; j <= aux; j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}