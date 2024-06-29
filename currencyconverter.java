import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Currency Selection
        System.out.print("Enter the base currency (USD, EUR, INR, PKR, CNY, GBP, ZAR): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, INR, PKR, CNY, GBP, ZAR): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Step 2: Define exchange rates for the specified currencies
        Map<String, Double> exchangeRates = new HashMap<>();

        // Set approximate exchange rates (not current)
        exchangeRates.put("USD_USD", 1.0);
        exchangeRates.put("USD_EUR", 0.85);
        exchangeRates.put("USD_INR", 83.0);
        exchangeRates.put("USD_PKR", 174.0);
        exchangeRates.put("USD_CNY", 6.45);
        exchangeRates.put("USD_GBP", 0.75);
        exchangeRates.put("USD_ZAR", 14.50);

        exchangeRates.put("EUR_USD", 1.18);
        exchangeRates.put("EUR_EUR", 1.0);
        exchangeRates.put("EUR_INR", 89.0);
        exchangeRates.put("EUR_PKR", 209.0);
        exchangeRates.put("EUR_CNY", 7.60);
        exchangeRates.put("EUR_GBP", 0.88);
        exchangeRates.put("EUR_ZAR", 17.10);

        exchangeRates.put("INR_USD", 0.012);
        exchangeRates.put("INR_EUR", 0.011);
        exchangeRates.put("INR_INR", 1.0);
        exchangeRates.put("INR_PKR", 2.37);
        exchangeRates.put("INR_CNY", 11.60);
        exchangeRates.put("INR_GBP", 0.010);
        exchangeRates.put("INR_ZAR", 0.19);

        exchangeRates.put("PKR_USD", 0.0057);
        exchangeRates.put("PKR_EUR", 0.0048);
        exchangeRates.put("PKR_INR", 0.42);
        exchangeRates.put("PKR_PKR", 1.0);
        exchangeRates.put("PKR_CNY", 18.35);
        exchangeRates.put("PKR_GBP", 0.0036);
        exchangeRates.put("PKR_ZAR", 0.069);

        exchangeRates.put("CNY_USD", 0.16);
        exchangeRates.put("CNY_EUR", 0.13);
        exchangeRates.put("CNY_INR", 0.086);
        exchangeRates.put("CNY_PKR", 0.055);
        exchangeRates.put("CNY_CNY", 1.0);
        exchangeRates.put("CNY_GBP", 0.12);
        exchangeRates.put("CNY_ZAR", 1.94);

        exchangeRates.put("GBP_USD", 1.33);
        exchangeRates.put("GBP_EUR", 1.14);
        exchangeRates.put("GBP_INR", 99.0);
        exchangeRates.put("GBP_PKR", 234.0);
        exchangeRates.put("GBP_CNY", 8.60);
        exchangeRates.put("GBP_GBP", 1.0);
        exchangeRates.put("GBP_ZAR", 19.28);

        exchangeRates.put("ZAR_USD", 0.069);
        exchangeRates.put("ZAR_EUR", 0.058);
        exchangeRates.put("ZAR_INR", 5.25);
        exchangeRates.put("ZAR_PKR", 14.46);
        exchangeRates.put("ZAR_CNY", 0.52);
        exchangeRates.put("ZAR_GBP", 0.052);
        exchangeRates.put("ZAR_ZAR", 1.0);

        // Step 3: Amount Input
        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amount = scanner.nextDouble();

        // Step 4: Currency Conversion
        String conversionKey = baseCurrency + "_" + targetCurrency;
        double exchangeRate = exchangeRates.getOrDefault(conversionKey, -1.0);

        if (exchangeRate == -1.0) {
            System.out.println("Conversion rate not available for " + baseCurrency + " to " + targetCurrency);
        } else {
            double convertedAmount = amount * exchangeRate;

            // Step 5: Display Result
            System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}

