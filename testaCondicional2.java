public class testaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("infelizmente voce nao pode entrar");
		}
	}
}