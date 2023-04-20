
public class testaCondicional {

	public static void main(String[] args) {

		int idade = 16;
		int quantidadedePessoas = 3;
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos, fique a vontade");
			System.out.println("seja bem vindo");
		} else if (quantidadedePessoas >= 3) {
			System.out.println("voce nao tem 18 mas pode entrar");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
