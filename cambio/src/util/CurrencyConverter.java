package util;

public class CurrencyConverter {

  public static double valorCotacaoDolar;
  public static double valorDolaresComprados;
  public static final double IOF = 0.06;
  
  public static double valorConvertidoReais() {    
    return valorCotacaoDolar * valorDolaresComprados * (1 + IOF);
  }

}
