import java.util.Scanner;

public class h3{
    public static void main(String[] args){
        Scanner inp =new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int N =inp.nextInt();
        double[] arr= new double[N];



        for (int i= 0; i <N; i++) {
            System.out.print("Enter a number: ");
            arr[i] =inp.nextDouble();
        }

        double max =arr[0];
        int ma =0;
        double min= arr[0];
        int mi =0;
        double sum =0;

        for (int i=0; i <N;i++)
         {
            if (arr[i] >max) {
                max=arr[i];
                ma= i;
            }
            if (arr[i]<min)
             {
                min =arr[i];
                mi= i;
            }
            sum =sum +arr[i];
        }


        double average= sum/ N;

        System.out.println("Maximum element " +max + " found at index "+ ma);
        System.out.println("Minimum element " + min+ " found at index " +mi);
        System.out.println("Summation: "+ sum);
        System.out.printf("Average: %.2f" ,average);
    }
}
