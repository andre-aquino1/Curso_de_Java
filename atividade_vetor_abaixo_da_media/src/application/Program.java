package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}

		media = soma / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTO ABAIXO DA MEDIA:");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		sc.close();
	}

}
