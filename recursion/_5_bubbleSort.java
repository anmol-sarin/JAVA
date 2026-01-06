import java.util.Arrays;
public class _5_bubbleSort {
    public static void main(String[] args){
        int[] arr = {4,7,3,2,1};
        bubble(arr,arr.length,0);
        System.out.print(Arrays.toString(arr));
    }
    static void bubble(int [] arr,int length , int index){
        if (length == 0){
            return;
        }
        if(index<length-1){
            if(arr[index]>arr[index+1]){
                //swap both of them
                int temp = arr[index];
                arr[index ]= arr[index+1];
                arr[index+1] = temp;
            }
            bubble(arr , length , index+1);
        }
        else{
            bubble(arr,length-1,0);
        }
    }
}
