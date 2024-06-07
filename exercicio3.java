package Vetor;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer3;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		Exer3[] vect = new Exer3[n];
		
		for(int i =0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome : ");
			String name = sc.nextLine();
			System.out.println("");
			System.out.print("Digite a idade : ");
			int idade = sc.nextInt();
			System.out.println("");
			System.out.print("Digite a altura : ");
			double altura =  sc.nextDouble();
			System.out.println("");
			
			vect[i] = new Exer3(name,idade,altura);
		}
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Nome : " + vect[i].getName());
			System.out.println("");
			System.out.print("Idade : " + vect[i].getIdade());
			System.out.println("");
			System.out.print("Altura : " + vect[i].getAltura());
			System.out.println("");
			System.out.println("");
		}
		
		
		double media = 0;
		double soma = 0;
		
		for(int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println("Os mais jovens : " + vect[i].getName());
				
			}
			soma = soma + vect[i].getAltura();
		}
		
		media = soma / vect.length;
		
		System.out.printf("Media das alturas : %.2f ", media);
		
		
		
		sc.close();

	}

}
