import java.util.Scanner;

public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter another number: ");
        int newVal = sc.nextInt();

        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = newVal;

        System.out.println("After resizing the array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
