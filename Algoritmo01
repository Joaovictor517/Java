public class Algoritimo01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anoAtual = 2023;
        int qtdadeDiaMes = 30;
        int mesAtual = 3;
        int diaNascimento;
        int mesNascimento;
        int anoNascimento;

        

        System.out.println("Escreva o dia do seu nascimento!!");
        diaNascimento = sc.nextInt();

        System.out.println("Escreva o mês do seu nascimento!!");
        mesNascimento = sc.nextInt();
        
        System.out.println("Escreva o ano do seu nascimento!!");
        anoNascimento = sc.nextInt();

        // Transformando ano em dia
        int idadeAno = anoAtual - anoNascimento;
        int idadeMes = idadeAno * 12;
        int idadeDia = (idadeMes * qtdadeDiaMes);
        int idadeDemasMeses = 0;

        // Calculo dos dias do mês
        if (mesNascimento > mesAtual){
            idadeDemasMeses = mesAtual * qtdadeDiaMes;
        }else if (mesNascimento < mesAtual){
            idadeDemasMeses = (mesAtual - mesNascimento) * qtdadeDiaMes;
        }

        int total = idadeDia + idadeDemasMeses + diaNascimento;

        System.out.println("Idade em dias : " + total);

        
    }
    
}