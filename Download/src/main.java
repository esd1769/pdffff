//import java.util.Scanner;
//
//public class h4 {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//
//        System.out.print("Please enter the length of array 1: ");
//        int n1=sc.nextInt();
//        int[] arr1 =new int[n1];
//
//        System.out.println("Please enter the elements of the arr1:");
//        for (int i = 0; i < n1; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//        System.out.print("Please enter the length of array 2: ");
//        int n2=sc.nextInt();
//        int[] arr2 = new int[n2];
//
//        System.out.println("Please enter the elements of the arr2:");
//        for (int i=0;i <n2;i++){
//            arr2[i] =sc.nextInt();
//        }
//
//        boolean isSubset =true;
//
//        for (int i =0; i< n2;i++) {
//            boolean fou =false;
//            for (int j =0; j< n1;j++) {
//                if (arr2[i] ==arr1[j]) {
//                    int k=i,l=j;
//                    boolean isSubsett =true;
//                    while(k<n1&&l<n2){
//                        if (arr2[l] !=arr1[k]) {
//                            break;
//                            isSubsett =false;
//
//                        }
//                    }
//                    isSubset =isSubsett;
//                }}
//            if (!fou){
//                isSubset= false;
//                break;
//            }
//        }
//
//        if (isSubset){
//            System.out.println("Array 2 is a subset of Array 1.");
//        } else{
//            System.out.println("Array 2 is not a subset of Array 1.");
//        }
//    }
//}
