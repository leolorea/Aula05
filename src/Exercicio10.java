import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println("Digite seu setor: ");
		String setor = scanner.next();
		System.out.println("Digite seu meio de transporte: ");
		String transporte = scanner.next();
		
		if (transporte.equalsIgnoreCase("carro")){
			System.out.println("Digite o ultimo digito da placa de seu carro: ");
			int placa = scanner.nextInt();
			switch (placa){
			case 0 :
				System.out.println("Seu dia de rodízio é sexta feira");
				break;
			case 1 :
				System.out.println("Seu dia de rodízio é segunda feira");
				break;
			case 2 :
				System.out.println("Seu dia de rodízio é segunda feira");
				break;
			case 3 :
				System.out.println("Seu dia de rodízio é terça feira");
				break;
			case 4 :
				System.out.println("Seu dia de rodízio é terça feira");
				break;
			case 5 :
				System.out.println("Seu dia de rodízio é quarta feira");	
				break;
			case 6 :
				System.out.println("Seu dia de rodízio é quarta feira");
				break;
			case 7 :
				System.out.println("Seu dia de rodízio é quinta feira");
				break;
			case 8 :
				System.out.println("Seu dia de rodízio é quinta feira");
				break;
				
			case 9 :
				System.out.println("Seu dia de rodízio é sexta feira");
				break;
				
			}
		
			
		}else if (transporte.equalsIgnoreCase("onibus")) {System.out.println("Rodizio não se aplica");}
		}
			
		
	


}
