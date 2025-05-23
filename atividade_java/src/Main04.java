import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		
		double valorHoras, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		
		valorHoras = sc.nextDouble();
		
		salario = horas * valorHoras;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
	}

}
