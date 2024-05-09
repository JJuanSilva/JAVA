package Test;

import java.util.Scanner;

public class AnguloRelogio {

	 public static void main(String[] args) {
	    	
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Digite a hora que deseja : ");      
	    	
	       int horas = sc.nextInt() ;
	       	
	       System.out.println("Digite os minutos que deseja : ");
	       
	        int minutos = sc.nextInt() ;
	        
	        double angulo = calcularAngulo(horas, minutos);
	        System.out.println(angulo);
	        
	        sc.close();
	    }

	    public static double calcularAngulo(int horas, int minutos) {
	        // Converter as horas para um valor entre 0 e 12
	        horas %= 12;

	       
	        double anguloHoras = 30 * horas;

	     
	        double anguloMinutos = 6 * minutos;

	        // Calcula a diferença dos ângulos
	        // Math.abs() calcula o valor absoluto
	        double angulo = Math.abs(anguloHoras - anguloMinutos);

	        // Calcula o menor ângulo entre os ponteiros
	        double resultado = Math.min(360 - angulo, angulo);

	        return resultado;
	        
	       
	    }
	}

