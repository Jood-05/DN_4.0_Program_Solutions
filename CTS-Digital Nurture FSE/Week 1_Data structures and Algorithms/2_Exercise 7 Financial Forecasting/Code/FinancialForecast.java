import java.util.*;

public class FinancialForecast {

    public static double futureValue(double presentValue, double growthRate, int years) {
       
        if (years == 0) {
            return presentValue;
        }

        return futureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the present value:");
        double presentValue = s.nextDouble();   
        System.out.println("Enter the growth rate:");
        double growthRate = s.nextDouble();      
        System.out.println("Enter the number of years:");
        int years = s.nextInt();                 

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, result);
    }
}
