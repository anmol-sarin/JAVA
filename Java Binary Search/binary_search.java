public class binary_search {
    public static void main(String[] args){
        int [] arr={22,33,44,55,66,77};
        int ans=binary_searching(arr,55);
        if (ans==-1){
        System.out.println("result not found !!");
        }
        else{
            System.out.println("target found at index position : "+ans);
        }
    }
    static int binary_searching(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2 ;
            if(arr[mid] < target){
                start=mid+1;
            } else if (arr[mid] > target) {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

