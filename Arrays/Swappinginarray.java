import java.util.Arrays;
public class Swappinginarray {
    public static void main(String[] args){
        int [] arr= {1,2,3,4,5};
        swapy(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swapy(int [] arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
