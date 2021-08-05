import java.util.Scanner;

public class Tabuada {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	
 System.out.println("Digite");
	for (int i=1; i<=10; i++) {
		
		int resultado = i*n;
		System.out.println(resultado);
	}
		
	}
}
