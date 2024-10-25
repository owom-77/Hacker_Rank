import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbsoluteValues {

    public static List<Integer> absoluteValues(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(Math.abs(num));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        scanner.close();

        List<Integer> outputList = absoluteValues(inputList);
        for (int num : outputList) {
            System.out.println(num);
        }
    }
}
