import java.util.Arrays;
public class reversing_the_array {
    public static void main(String[] args){
        int [] arr={11,22,33,44,55,66};
        reverse(arr);
    }
    static void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swapy(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swapy(int [] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
//        System.out.println(Arrays.toString(arr));
    }
}
