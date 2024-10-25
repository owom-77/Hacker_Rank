import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterArray {

    public static List<Integer> filterLessThan(int upperLimit, List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < upperLimit) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int delimiter = scanner.nextInt();

        List<Integer> inputList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        scanner.close();

        List<Integer> filteredList = filterLessThan(delimiter, inputList);
        for (int num : filteredList) {
            System.out.println(num);
        }
    }
}
