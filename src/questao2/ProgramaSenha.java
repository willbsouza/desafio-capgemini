package questao2;

import java.util.Scanner;

public class ProgramaSenha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escolha sua senha: ");
		String senha = scan.nextLine();
		Validacao.verificarSenha(senha);
	}
}
