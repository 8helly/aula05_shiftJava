import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        //Calcular a área de uma residência
        /*
        digitar um comodo: sala
        digite a largura: 4
        digite o comprimento: 5
        area da sala tem 20 m2
        deseja inserir outro comodo? S|N (sim, não)
        quando o usuário falar não: Mostrar a área total
         */

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        double largura, comprimento, areaComodo, areaTotal = 0;
        String nomeComodo, continuar;
        System.out.println("Calculo da área residencial");
        do{
            System.out.println("Digite o nome do cômodo: ");
            nomeComodo = leitorTexto.nextLine();
            System.out.println("Digite a largura do cômodo: ");
            largura= leitor.nextDouble();
            System.out.println("Digite o comprimento do cômodo: ");
            comprimento = leitor.nextDouble();
            areaComodo = largura * comprimento;
            System.out.println("A área do(a) " + nomeComodo + " é de " + areaComodo + "m²");
            areaTotal += areaComodo;
            System.out.println("Deseja adicionar o registro de outro cômodo da residência? [S|N|Sim|Não]");
            continuar = leitorTexto.nextLine();
        }while(continuar.equalsIgnoreCase("s")|| continuar.equalsIgnoreCase("sim"));
        System.out.println("A área da residência é: " + areaTotal + " m².");
    }
}
