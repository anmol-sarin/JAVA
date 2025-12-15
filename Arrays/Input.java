import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        int [] arr= new int[5];
//        arr[0]=321;
//        arr[1]=432;
//        arr[2]=543;
//        arr[3]=654;
//        arr[4]=765;
//        System.out.print(arr[4]);
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        System.out.print(Arrays.toString(arr));
        String [] str = new String[5];
        for (int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
