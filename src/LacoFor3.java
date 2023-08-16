import java.util.Scanner;

public class LacoFor3 {
    public static void main(String[] args) {
        //Faça um programa que peça para o usuário digitar 10 números
        //Quantos números pares, quantos números ímpares, média dos números digitados

        Scanner leitor = new Scanner(System.in);
        int numero, qtdPares = 0, qtdImpares = 0, media, soma = 0, i;
        for(i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número:");
            numero = leitor.nextInt();
            soma += numero;
            if(numero % 2 == 0){
                qtdPares++;
            }else {
                qtdImpares++;
            }
        }//fim do for
        media = soma / 10;
        System.out.println("Quantidade de números pares digitados foi:" + qtdPares);
        System.out.println("Quantidade de números ímpares digitados foi:" + qtdImpares);
        System.out.println("A média dos números digitados foi:" + media);

    }
}
