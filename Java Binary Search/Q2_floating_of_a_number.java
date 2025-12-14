public class Q2_floating_of_a_number {
    public static void main(String [] args){
        int [] arr={2,4,6,8,10};
        System.out.print(floating(arr,5));
    }
    static int floating(int [] arr,int target){
        int start=0;
        int end=arr.length - 1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        
        return arr[end];
    }
}
