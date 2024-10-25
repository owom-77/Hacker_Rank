import java.util.Scanner;

public class Functional_Programming{

    static int sum(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter a num2: ");
        int num2 = sc.nextInt();

        System.out.println(sum(num1, num2));

    }
}