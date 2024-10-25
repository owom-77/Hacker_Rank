import java.util.Scanner;

public class ListReplication {

    static void PrintElement(){
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[4];

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            System.out.println("Enter a element you want: ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length;i++){
            int j=0;
            while (j<num) {
                System.out.println(arr[i]);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        PrintElement();
    }
}
