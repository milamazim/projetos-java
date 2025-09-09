package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        CurrencyConverter.valorCotacaoDolar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        CurrencyConverter.valorDolaresComprados = sc.nextDouble();
        System.out.printf("Valor a ser pago em reais = %.2f", CurrencyConverter.valorConvertidoReais());

        sc.close();

    }
}
