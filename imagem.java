package imagem;

import java.util.Scanner;

public class imagem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// declaracao de variaveis
		int x, y, z[][] = new int[16][16];
		
		// exibicao do texto na tela
		System.out
				.println("escolha as cores conforme o numero\n-branco = 0\n-preto = 1\n-vermelho = 2\n-bege = 3");
				
		// laço de repetição
		for (x = 0; x < 16; x++) {
		    
			// exibicao do texto na tela
			System.out.printf("elementos %da. linha:\n", (x + 1));
			for (y = 0; y < 16; y++) {
				System.out.printf("m[%d][%d] = ", x, y);
				z[x][y] = leia.nextInt(); 
        
			}
			
			System.out.printf("\n");
      
		}
    
		System.out.printf("\n");
		for (x = 0; x < 16; x++) {
			System.out.printf("linha: ", (x + 1));
			for (y = 0; y < 16; y++) {
				System.out.printf("%d ", z[x][y]);
        
			}
      
			System.out.printf("\n");
      
		}

	}

}
