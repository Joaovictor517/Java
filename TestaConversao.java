
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//long numerogrande = 138283628L;
		//long é usado para guardar números grandes acima de 2M. Se passar de 2M, coloca o L.
		//short valorPequeno = 1828;
		// o short guarda números pequenos.
		//byte b = (byte) 282;
		//p byte guarda valores menores ainda.
		//float pontoFlutuante = 3.14f;
	
		double valor1 = 0.2;
		double valor2 = 0.1;
		double valorTotal = valor1 + valor2;
		
		System.out.println(valorTotal);
	}
} 