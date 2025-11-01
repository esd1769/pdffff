import java.util.Scanner;

public class h2{
    public static void main(String[] args){
        Scanner inp =new Scanner(System.in);

        System.out.print("N = ");
        int N =inp.nextInt();
        int[] arr= new int[N];




        for (int i= 0;i <N;i++) {
            System.out.print("Enter a number: ");
            arr[i]=inp.nextInt();
        }

        int target =inp.nextInt();
        boolean fou=false;



        for (int i=0; i <N; i++) {
            if (arr[i] ==target) {
                System.out.println(target+" is at index " + i);
                fou =true;
                break;
            }
        }


        if (!fou){
            System.out.println("Element not found");
        }
    }
}
