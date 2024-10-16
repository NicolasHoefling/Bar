package nicolashoefling.bar;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entradas do usuário
        System.out.println("\nutilize (F) para fem. ou (M) para masc.");
        System.out.print("Sexo:");
        char sexo = scanner.next().toUpperCase().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        // preços fixos
        double precoIngresso = (sexo == 'F') ? 8.00 : 10.00;
        double precoCerveja = 5.00;
        double precoRefrigerante = 3.00;
        double precoEspetinho = 7.00;
        double couvertArtistico = 4.00;

        // calculo do consumo
        double consumo = (quantidadeCervejas * precoCerveja) +
                (quantidadeRefrigerantes * precoRefrigerante) +
                (quantidadeEspetinhos * precoEspetinho);

        // verificação da isenção do couvert artístico
        if (consumo > 30.00) {
            couvertArtistico = 0.00;
        }

        // calculo do valor total a pagar
        double valorTotal = consumo + couvertArtistico + precoIngresso;

        // Exibição do relatório
        System.out.println("\n^---------------------------------------------^");
        System.out.println("        RELATÓRIO DE VALORO A PAGAR");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        System.out.printf("Couvert = R$ %.2f\n", couvertArtistico);
        System.out.printf("Ingresso = R$ %.2f\n", precoIngresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);
        System.out.println("^---------------------------------------------^");
        scanner.close();
    }
}
