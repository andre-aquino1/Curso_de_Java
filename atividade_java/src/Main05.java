import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
			
		int cod1, numeroPeca1, cod2, numeroPeca2;
		double valor1, valor2, valorPagar;
		
		cod1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorPagar = (valor1 * numeroPeca1) + (valor2 * numeroPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valorPagar);
		
		
		sc.close();
	}

}
