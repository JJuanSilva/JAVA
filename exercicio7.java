package Vetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		double soma,div;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		System.out.print("");
		
		
		
		double vect[] = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um número : ");
			System.out.print("");
			vect[i] = sc.nextDouble();
		}
		
		soma = 0;
		for(int i=0; i<n;i++) {
			soma = soma + vect[i];
		}
		
		div = soma /4;
		
		System.out.printf("Media do vetor : %.3f\n", div);
		System.out.println("elementos abaixo da media :");
		
		for(int i =0; i<n;i++) {
			if (vect[i]< div) {
				System.out.println(vect[i]);
			}
			
		}
		
		
		
		
		
		
		
		sc.close();
		

	}

}
