package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, qthomens, qtmulheres;
		double menoraltura, maioraltura, alturafemmedia, alturafemtotal;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		double[] altura = new double[n];
		char[] sexo = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			sexo[i] = sc.next().charAt(0);
		}

		menoraltura = altura[0];
		maioraltura = altura[0];

		for (int i = 0; i < n; i++) {
			if (altura[i] > maioraltura) {
				maioraltura = altura[i];
			}

			if (altura[i] < menoraltura) {
				menoraltura = altura[i];
			}
		}

		qthomens = 0;
		qtmulheres = 0;
		alturafemtotal = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'M') {
				qthomens++;
			} else {
				qtmulheres++;
				alturafemtotal = alturafemtotal + altura[i];
			}
		}

		alturafemmedia = alturafemtotal / qtmulheres;

		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemmedia);
		System.out.printf("Numero de homens = %d\n", qthomens);

		sc.close();
	}

}
