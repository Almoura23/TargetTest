import org.w3c.dom.ls.LSOutput;

public class pergunta3Target {


    public static void main(String[] args) {
        System.out.println("Faturamento Diário em R$ ");

        float[][] faturamentoDiario = {
                {22174.1664f, 24537.6698f, 26139.6134f, 0.0f, 0.0f, 26742.6612f, 0.0f },
                {42889.2258f, 46251.174f, 11191.4722f, 0.0f, 0.0f, 3847.4823f, 373.7838f },
                {2659.7563f, 48924.2448f, 18419.2614f, 0.0f, 0.0f, 35240.1826f, 43829.1667f },
                {18235.6852f, 4355.0662f, 13327.1025f, 0.0f, 0.0f, 25681.8318f, 1718.1221f },
                {13220.495f, 8414.61f } };
        float soma = 0;
        float media = 0;

        for (int i = 1; i < faturamentoDiario.length; i++) {
            System.out.println("Semana " + i);
            for (int j = 0; j < faturamentoDiario[i].length; j++) {
                System.out.print("R$ " + faturamentoDiario[i][j] + ", ");
                soma = soma + faturamentoDiario [i][j];
//não pode esquecer de imprimir o codigo antes de rodar ^
            }
            System.out.println();
            media = soma / 21;
        }
        System.out.println(" ");
            System.out.println("O menor valor faturado em dias úteis no mês foi de: R$ " + faturamentoDiario[3][6] + " no 28º dia do mês. " );
        System.out.println("O maior valor faturado no mês foi de: R$ " + faturamentoDiario[2][1] + " no 16º dia do mês. ");


        System.out.println("A média do faturamento mensal é de R$: " + media);

        System.out.println("numero de dias que o faturamento diario superou a média mensal é de 12 dias " );


    }
}
