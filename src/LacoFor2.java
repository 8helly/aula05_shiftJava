import java.util.Scanner;

public class LacoFor2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //Exiba a tabuada de número qualquer
        double numero, tab, i;
        System.out.println("Digite um número para calcular a tabuada: ");
        numero = leitor.nextDouble();

        for (i = 1; i <= 10; i++) {          //i = i +1 | i += 1
            tab = numero * i;
            System.out.println(numero + " x " + i + " = " + tab);
        }
    }
}
