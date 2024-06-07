package Vetor;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		int soma = 0;
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Digite um número : ");
			vect[i] = sc.nextInt();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.print("Valores : ");
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println("");
		System.out.println("Soma : " + soma);
		System.out.println("Media : " + media);
		
		
		sc.close();

	}

}
