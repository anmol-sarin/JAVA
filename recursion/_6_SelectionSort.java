import java.util.Arrays;
public class _6_SelectionSort {
    public static void main(String [] args){
        int [] arr = {4,8,5,3,2,1};
        SelectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int [] arr , int length , int index , int max){
        if(length == 0 ){
            return;
        }
        if(index < length ){
            if(arr[max]<arr[index]){
                SelectionSort(arr , length , index+1 , index);
            }else{
                SelectionSort(arr,length, index+1 , max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[length - 1];
            arr[length - 1] = temp;

            SelectionSort(arr,length-1,0 , 0);
        }
    }
}
