package Vetor;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,soma;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		
		int vectA[] = new int[n];
		int vectB[] = new int[n];
		
		System.out.println("Digite os valores do vetor A");
		for(int i=0; i< vectA.length;i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i=0; i< vectB.length;i++) {
			vectB[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			soma = vectA[i] + vectB[i]; 
			System.out.println("Soma dos vetores : " + soma);
		}
		
		
		
		
		sc.close();
	}

}
