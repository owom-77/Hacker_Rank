import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveOddPositions {

    public static List<Integer> removeOddPositions(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < arr.size(); i += 2) {
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

        List<Integer> outputList = removeOddPositions(inputList);
        for (int num : outputList) {
            System.out.println(num);
        }
    }
}
