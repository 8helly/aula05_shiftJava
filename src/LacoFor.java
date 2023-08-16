import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        //Laços => Condicionais : While(condição) - Do{}While(condição);

        //      => Contado : for(inicialização; condição; incremento){}

        Scanner leitor = new Scanner(System.in);
        //Exiba a tabuada de número qualquer
        int numero, tab, i;
        System.out.println("Digite um número para calcular a tabuada: ");
        numero = leitor.nextInt();

        for (i = 1; i <= 10; i++) {          //i = i +1 | i += 1
            tab = numero * i;
            System.out.println(numero + " x " + i + " = " + tab);
        }

        System.out.println("Você deseja visualizar a tabuada a partir de qual número: ");
        int ini = leitor.nextInt();
        System.out.println("Você deseja visualizar a tabuada até que número: ");
        int fim = leitor.nextInt();

        for (i = ini; i <= fim; i++) {          //i = i +1 | i += 1
            tab = numero * i;
            System.out.println(numero + " x " + i + " = " + tab);
        }


        System.out.println("O valor de i ao finalizar o laço é: " + i);
        /*
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        .
        .
        2 x 10 = 20
        * */
    }
}
