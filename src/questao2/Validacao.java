package questao2;

public class Validacao {
	
	public static void verificarSenha(String senha) {
		int contemLowerCase = 0, contemUpperCase = 0, contemDigit = 0, contemEspecial = 0;
		for(int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i)))
				contemUpperCase = 1;
			if (Character.isLowerCase(senha.charAt(i)))
				contemLowerCase = 1;
			if (Character.isDigit(senha.charAt(i)))
				contemDigit = 1;
			if (senha.charAt(i) == '!' || senha.charAt(i) == '@' || 
					senha.charAt(i) == '#' || senha.charAt(i) == '$' || 
					senha.charAt(i) == '%' || senha.charAt(i) == '^' || 
					senha.charAt(i) == '&' || senha.charAt(i) == '*' || 
					senha.charAt(i) == '(' || senha.charAt(i) == ')' || 
					senha.charAt(i) == '-' || senha.charAt(i) == '+')
				contemEspecial = 1;
		}
		int total = contemLowerCase + contemUpperCase + contemDigit + contemEspecial;
		int especiaisFaltantes = 4 - total;
		int totalFaltantes = 6 - senha.length();
		if (especiaisFaltantes <= 0 && totalFaltantes <= 0){
			System.out.println("Senha forte. Pode ser usada!");
		}else if(especiaisFaltantes >= totalFaltantes){
			System.out.println("Senha fraca. Digite no mínimo mais " + especiaisFaltantes + " dígitos!");
		}else {
			System.out.println("Senha fraca. Digite no mínimo mais " + totalFaltantes + " dígitos!");
		}
	}
}
