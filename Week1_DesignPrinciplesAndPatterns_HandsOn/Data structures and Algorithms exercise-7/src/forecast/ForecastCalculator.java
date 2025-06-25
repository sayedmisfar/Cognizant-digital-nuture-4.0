package forecast;

public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }
        // Recursive case
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double presentValue = 10000; // Initial investment
        double annualRate = 0.05;    // 5% growth rate
        int years = 10;              // Forecast for 10 years

        double result = futureValue(presentValue, annualRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, result);
    }
}
