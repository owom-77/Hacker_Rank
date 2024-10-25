import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountElements {

    public static int countElements(List<Integer> arr) {
        int count = 0;
        for (int ignored : arr) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputList.add(scanner.nextInt());
        }
        scanner.close();

        int result = countElements(inputList);
        System.out.println(result);
    }
}
