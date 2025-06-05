package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, posmaior;
		double maior;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		maior = vetor[0];
		posmaior = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}

		System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		sc.close();
	}

}
