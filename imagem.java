package imagem;

import java.util.Scanner;

public class imagem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// declaracao de variaveis
		int lina, coluna, matr[][] = new int[16][16];
		
		// exibicao do texto na tela
		System.out
		.println("escolha as cores conforme o numero\n-branco = 0\n-preto = 1\n-vermelho = 2\n-bege = 3");
				
		// laço de repetição
		for (linha = 0; linha < 16; linha++) {
		    
			// exibicao do texto na tela
			System.out.printf("elementos %da. linha:\n", (linha + 1));
			for (coluna = 0; coluna < 16; coluna++) {
				System.out.printf("matr[%d][%d] = ", linha, coluna);
				matr[linha][coluna] = leia.nextInt(); 
        
			}
			
			System.out.printf("\n");
      
		}
    
		System.out.printf("\n");
		for (linha = 0; linha < 16; linha++) {
			System.out.printf("linha: ", (linha + 1));
			for (coluna = 0; coluna < 16; coluna++) {
				System.out.printf("%d ", matr[linha][coluna]);
        
			}
      
			System.out.printf("\n");
      
		}

	}

}


