import java.util.Scanner;

public class Comissao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira o valor gasto: ");
        double despesa = sc.nextDouble();
//Calcula o valor da comissão
        double comissao = despesa * 0.10;
// Utilizei o printf para formatar um número com duas casas decimais
        System.out.printf("Valor da comissão: %.2f" , comissao);


        sc.close();

    }
}
