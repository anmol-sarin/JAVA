public class Q1_ceiling_of_a_number {
    public static void main(String [] args){
        int [] arr={2,4,6,8,10,12,14,16};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println("om namah shivay !!");
        System.out.print(ceiling(arr,11));

    }
    static int ceiling(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
