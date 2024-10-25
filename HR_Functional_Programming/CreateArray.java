import java.util.ArrayList;
import java.util.List;

public class CreateArray {

    public static List<Integer> createArray(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10; 
        List<Integer> output = createArray(n);
        System.out.println(output);
    }
}
