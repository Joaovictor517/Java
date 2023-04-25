import java.util.Scanner;

public class Algoritmo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			String NomeAluno;
		    double nota1, nota2, nota3, nota4;
			
			System.out.println("Digite seu nome.");
			NomeAluno = sc.next();
			
			System.out.println("Digite sua nota da primeira avalição.");
			nota1 = sc.nextDouble();

			System.out.println("Digite sua nota da segunda avalição.");
			nota2 = sc.nextDouble();

			System.out.println("Digite sua nota da terceira avalição.");
			nota3 = sc.nextDouble();

			System.out.println("Digite sua nota da quarta avalição."); 
			nota4 = sc.nextDouble();
			
			double MediaGeral = (nota1*2 + nota2*3 + nota3*2 + nota4*3) / (2+3+2+3);
            
			//verificando média
			if (MediaGeral >= 5) {
				System.out.println("Parabéns " + NomeAluno + ", você está aprovado!! e sua média foi de: " + MediaGeral);
			} else {
				System.out.println("Que pena " + NomeAluno + ", você está reprovado!! sua média foi de: " + MediaGeral);
			}
		}
}
