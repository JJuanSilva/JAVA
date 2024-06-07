package Vetor;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número : ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		 
		sc.close();

	}

}
