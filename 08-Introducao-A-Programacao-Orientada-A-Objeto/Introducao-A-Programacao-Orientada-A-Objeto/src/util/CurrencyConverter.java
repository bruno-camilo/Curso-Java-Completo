package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double convert(double quantity, double price){
        return quantity * price * (1.0 + IOF);
    }
}
