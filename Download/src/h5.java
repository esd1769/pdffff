public class h5 {
    public static void main(String[] args){
        int[] marks ={85, 90, 75, 44, 99};
        String[] names= {"Bob", "Alice", "Max", "Marry", "Rosy"};

        int n =marks.length;

        for (int i =0; i <n - 1;i++) {
            for (int j= 0; j< n - 1 -i; j++){
                if (marks[j] >marks[j + 1]) {
                    int tempM= marks[j];
                    marks[j] =marks[j + 1];
                    marks[j + 1]= tempM;

                    String tempN =names[j];
                    names[j]= names[j + 1];
                    names[j +1] = tempN;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0;i <n;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();

        for (int i=0; i< n; i++){
            System.out.print(names[i]+" ");
        }
    }
}
