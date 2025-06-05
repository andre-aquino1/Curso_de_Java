package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, soma = 0, npares = 0;
		double mediapares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				npares++;
			}

		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediapares = (double) soma / npares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}

		sc.close();
	}

}
