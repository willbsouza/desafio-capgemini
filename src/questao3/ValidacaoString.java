package questao3;
import java.util.Arrays;

public class ValidacaoString {
	public static int validarAnagrama(String palavra) {
		int count = 0;
		for(int i = 0; i < palavra.length()-1; i++) {
			for(int j = i; j < palavra.length(); j++) {
				if(palavra.charAt(i) == palavra.charAt(j) && i != j) {
					count++;
					if(i+1 != j) {
						char[] subString1 = palavra.substring(i, j).toCharArray();
						char[] subString2 = palavra.substring(i+1, j+1).toCharArray();
						Arrays.sort(subString1);
						Arrays.sort(subString2);
						if (Arrays.equals(subString1, subString2)) {
							count++;
						}
					}
				}
			}
		}		
		return count;
	}
}
