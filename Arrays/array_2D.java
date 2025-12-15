import java.util.Arrays;
import java.util.Scanner;
public class array_2D {
    public static void main(String [] args){
        System.out.println("normal 1 D array : ");
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
//        System.out.println("Enter the number of rows wanted to form 2-D array :");
        Scanner in = new Scanner(System.in);
//        int num= in.nextInt();
        int[][] arr2d= new int[3][];
        //for taking the input
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                arr2d[i][j]=in.nextInt();
            }
        }
        //for print the 2 d array
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<arr2d.length;i++){
            System.out.println(Arrays.toString(arr2d[i]));
        }
    }
}
