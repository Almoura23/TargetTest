public class pergunta4Target {
    public static void main(String[] args) {

        System.out.println("Faturamento Mensal por Estado: ");


        float SP = 67.83643f;
        System.out.println("São Paulo: " + SP);
        float RJ = 36.67866f;
        System.out.println("Rio de Janeiro: " + RJ);
        float MG = 29.22988f;
        System.out.println("Minas Gerais: " + MG);
        float ES = 27.16548f;
        System.out.println("Espirito Santo: " + ES);
        float outros = 19.84953f;
        System.out.println("Outros: " + outros);

        float totalGeral = SP + RJ + MG + ES + outros;
        System.out.println(" ");
        System.out.println("Total Geral: " + totalGeral);

        //calculo porcentagem:

        float psp = ((SP / totalGeral) * 100);
        float prj = ((RJ / totalGeral) * 100);
        float pmg = ((MG / totalGeral) * 100);
        float pes = ((ES / totalGeral) * 100);
        float out = ((outros / totalGeral) * 100);

        System.out.println("Porcentagem do estado de São Paulo: " + psp + "%");
        System.out.println("Porcentagem do estado do Rio de Janeiro: " + prj + "%");
        System.out.println("Porcentagem do estado de Minas Gerais: " + pmg + "%");
        System.out.println("Porcentagem do estado do Espirito Santo: " + pes + "%");
        System.out.println("Porcentagem de outros estados: " + out + "%");
    }
}
