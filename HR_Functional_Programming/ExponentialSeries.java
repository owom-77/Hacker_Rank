import java.util.Scanner;

public class ExponentialSeries {

    public static double computeExponential(double x) {
        double result = 1.0;  
        double term = 1.0;   
        for (int i = 1; i < 10; i++) {
            term = term * (x / i); 
            result += term;        
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            double x = scanner.nextDouble();
            
            double result = computeExponential(x);
            
            System.out.printf("%.4f%n", result);
        }

        scanner.close();
    }
}
