package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, qtpares;

		System.out.print("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("\nNUMEROS PARES:");

		qtpares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				qtpares++;
			}
		}

		System.out.println("\n\nQUANTIDADE DE PARES = " + qtpares);

		sc.close();
	}

}
