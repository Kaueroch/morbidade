package lições;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) { 
		
			Scanner sc = new Scanner(System.in);
			System.out.println("qual o seu peso");
			double peso = sc.nextDouble();
			System.out.println("Qual a sua altura ?");
			double altura = sc.nextDouble();
			double IMC = peso * (altura * altura);
			System.out.println(IMC);
		   if(IMC >= 17.50 || IMC >= 29.99 ) {
			   System.out.println("Entre 17,50 e 24,44 Peso normal");
			   
		   }else if(IMC >= 30.00 || IMC <= 40.00 || IMC >= 40.00){
			   System.out.println("Entre 30 e 34,99 Obesidade I"
			   		+ "Entre 35 e 39,99 Obesidade II (severa)\r\n"
			   		+ "Acima de 40 Obesidade III (mórbida)");
		   }else if(IMC <= 17.00 || IMC <= 17.49) 
		   {System.out.println("Abaixo do peso");}
		}
	}