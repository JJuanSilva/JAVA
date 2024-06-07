package Vetor;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, qtdpares;

		System.out.println("Quantos numeros vc vai digitar? ");
		n = sc.nextInt();

		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número : ");
			vect[i] = sc.nextInt();
		}

		System.out.println("\nNumeros Pares");

		qtdpares = 0;

		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtdpares++;
			}
		}
		
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);
		
		sc.close();

	}

}
