public class max_item {
    public static void main(String[] args){
        int[] arr={1,24,45,67,32,11};
        System.out.println(max_item(arr,6));
        System.out.println(max_item_in_range(arr,1,2));
    }
    static int max_item(int [] arr,int size){
        int maxVal = arr[0];
        for(int i=0;i<size;i++){
                if (arr[i] > maxVal ) {
                    maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int max_item_in_range(int[] arr,int start,int end) {
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}

