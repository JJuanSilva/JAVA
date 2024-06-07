package Vetor;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int n,posmaior;
		double maior;
	
		System.out.print("Quantos números você vai digitar?");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Digite um número : ");
			System.out.print("");
			vect[i] = sc.nextInt();
		}
		
		maior = vect[0];
		posmaior = 0;
		
		
		for (int i=0;i<vect.length;i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.println("Maior valor : " + maior);
		System.out.println("");
		System.out.println("Posicao maior : " + posmaior);
		
		sc.close();
	}

}
