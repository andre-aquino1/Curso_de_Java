import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codItem = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		
		if(codItem == 1 ) {
			total = quantidade * 4.0;
		}
		else if (codItem == 2) {
			total = quantidade * 4.50;
		}
		else if (codItem == 3) {
			total = quantidade * 5.00;
		}
		else if (codItem == 4) {
			total = quantidade * 2.00;
		}
		else {
			total = quantidade * 1.50;
		}
		
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
