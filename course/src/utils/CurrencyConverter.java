package utils;

public class CurrencyConverter {

    public static double total(double taxDollar, double priceDollar) {
        return taxDollar * priceDollar + (taxDollar * priceDollar * 6 / 100);
    }
}
