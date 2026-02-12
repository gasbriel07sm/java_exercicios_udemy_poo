package ex07.util;

public class CurrencyConverter {

    public static final double IOF = 6;

    public static double dollarToReal(double dollarPrice, double dollarBought) {
        return (dollarPrice * dollarBought) * (1 + IOF/100);
    }
}
