import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

    public static List<Integer> reverseList(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            result.add(arr.get(i));
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

        List<Integer> reversedList = reverseList(inputList);
        for (int num : reversedList) {
            System.out.println(num);
        }
    }
}
