import java.util.Scanner;

public class FinancialForecastingOptimized {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate in percentage: ");
        double ratePercentage = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double growthRate = ratePercentage / 100;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + futureValue);

        sc.close();
    }
}