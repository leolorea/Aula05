import java.util.Scanner;

public class Fibonacii {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int fibonacci = 1;
		int fibonacci2 = 1;
		
		
		for (int i=0; i<n; i++) {
			System.out.println(fibonacci);
			System.out.println(fibonacci2);
			
			fibonacci = fibonacci + fibonacci2;
			fibonacci2 = fibonacci + fibonacci2;
		
		
			
		}
	}

}
