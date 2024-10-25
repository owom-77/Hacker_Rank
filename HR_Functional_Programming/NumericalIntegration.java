import java.util.Scanner;

public class NumericalIntegration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coeffArea = new int[5];
        for (int i = 0; i < 5; i++) {
            coeffArea[i] = sc.nextInt();
        }

        int[] coeffVolume = new int[5];
        for (int i = 0; i < 5; i++) {
            coeffVolume[i] = sc.nextInt();
        }

        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();

        double area = integrate(coeffArea, lowerLimit, upperLimit, false);
        double volume = integrate(coeffVolume, lowerLimit, upperLimit, true);

        System.out.printf("%.1f\n", area);
        System.out.printf("%.1f\n", volume);
    }

    private static double integrate(int[] coeff, int lower, int upper, boolean isVolume) {
        double result = 0.0;
        int steps = 1000;
        double deltaX = (upper - lower) / (double) steps;

        for (int i = 0; i < steps; i++) {
            double x = lower + i * deltaX;
            double fx = polynomialValue(coeff, x);

            if (isVolume) {
                result += Math.PI * fx * fx * deltaX;
            } else {
                result += fx * deltaX;
            }
        }

        return result;
    }

    private static double polynomialValue(int[] coeff, double x) {
        double result = 0.0;
        for (int i = 0; i < coeff.length; i++) {
            result += coeff[i] * Math.pow(x, i);
        }
        return result;
    }
}
