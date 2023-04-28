//**Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:**
//
//- infantil A = 5 - 7 anos
//- infantil B = 8-10 anos
//- juvenil A = 11-13 anos
//- juvenil B = 14-17 anos
//- adulto = maiores de 18 anos

 import java.util.Scanner;

public class AlgoritmoSA04 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int idade;

            System.out.println("Digite a sua idade:");
            idade = sc.nextInt();

                switch(idade) {
                    case 5:
                    case 6:
                    case 7:
                        System.out.println("Você entra na categoria Infantil A, Parabéns!!");
                        break;
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("Você entra na categoria Infantil B, Parabéns!!");
                        break;
                    case 11:
                    case 12:
                    case 13:
                        System.out.println("Você entra na categoria Juvenil A, Parabéns!!");
                        break;
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        System.out.println("Você entra na categoria Juvenil B, Parabéns!!");
                        break;
                    case 18:
                    default:
                        System.out.println("Você entra na categoria Adulto, Parabéns!!");
                        break;
            }
        }
    }
