public class testaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 19;
		int quantidadePessoas =2;		
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!!");
		} else {
			System.out.println("infelizmente voce nao pode entrar.");
		}
	}
}
