package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgVetores {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
		altura média dessas pessoas.
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de alturas: ");
		int n = sc.nextInt();
		
		// declaração de um vetor
		
		double[] vect = new double[n];
		
		//Inserindo valores no vetor
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite a altura %d:", i);
			vect[i] = sc.nextDouble();
		}
		
		//calculando a media dos valores informados
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma /n;
		
		System.out.printf("Média das alturas: %.2f%n", media);
		
		sc.close();

	}

}
