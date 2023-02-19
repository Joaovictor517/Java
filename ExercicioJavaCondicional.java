
public class ExercicioJavaCondicional {

	public static void main(String[] args) {
		int nota1 = 1;
		int nota2 = 4;
		int nota3 = 2;
		int nota4 = 3;
		int notaGeral = (nota1*2 + nota2*3 + nota3*2 + nota4*3);
		
		if (notaGeral >= 50) {
			System.out.println("Parabéns. você está aprovado sua média é " + notaGeral + ".");
		} else {
			if (notaGeral <= 50) {
				System.out.println("Que pena!! Você está reprovado, sua média é " + notaGeral + ".");
			}
		}
	}
}

