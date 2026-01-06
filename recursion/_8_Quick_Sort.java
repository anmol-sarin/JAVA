
public class _8_Quick_Sort {
    public static void main(String[] args){
        int [] arr = {5,9,3,2,4,1,6};
        quick_sort(arr,0, arr.length-1);
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void quick_sort(int [] arr , int s , int e ){
        if(s>=e){
            return;
        }
        int p = partition(arr,s,e);
        quick_sort(arr,s,p-1);
        quick_sort(arr,p+1,e);
    }
    static int partition(int [] arr,int s, int e){
        int pivot = arr[s];
        int cnt = 0;
        for(int i = s+1;i<=e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int pivotIndex = s + cnt;
        swap(arr,pivotIndex,s);


        int i = s , j = e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
