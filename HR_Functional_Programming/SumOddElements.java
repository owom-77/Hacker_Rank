import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOddElements {

    public static int sumOfOddElements(List<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        scanner.close();

        int result = sumOfOddElements(inputList);
        System.out.println(result);
    }
}
