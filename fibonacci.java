import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero");
        int qtd = numero.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print("0 ");
        System.out.print("1 ");
        qtd = qtd - 2;
        while (qtd > 0) {
            System.out.print((n1 + n2) + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            qtd--;
        }
        if (numero.nextInt() == n1) {
            System.out.println("O numero está na sequencia fibonacci");
        } else if (numero.nextInt() == n2) {
            System.out.println("O numero está na sequencia fibonacci");
        } else {
            System.out.println("O numero não está na sequencia fibonacci");
        }

    }
}