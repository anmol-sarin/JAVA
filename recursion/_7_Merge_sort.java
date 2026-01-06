import java.util.Arrays;
public class _7_Merge_sort {
    public static void main(String[] args){
        int [] arr = {5,4,3,2,1};
        merge_sort_implace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    static int[] merge_sort(int[] arr){
//        if(arr.length == 1){
//            return arr;
//        }
//        int mid = arr.length / 2;
//        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length)) ;
//        return merge_inplace(arr,s,mid,e);
//    }
    static void merge_inplace(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s];
        int i =s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<arr.length){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<arr.length){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l =0;l<mix.length;l++ ){
            arr[s+l] = mix[l];
        }
    }
    static void merge_sort_implace(int[] arr , int s,int e){
        if(e-s == 1){
            return ;
        }
        int mid = (s+e)/ 2;
        merge_sort_implace(arr,s,mid);
        merge_sort_implace(arr,mid,e);
        
    }
}
