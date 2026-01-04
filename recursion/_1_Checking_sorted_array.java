public class _1_Checking_sorted_array {
    public static void main(String[] args){
        int [] arr = {1,3,4,7,8,9};
        System.out.println(is_sorted(arr,0));
    }
    static boolean is_sorted(int [] arr , int index){
        if(index == arr.length - 1 ){
            return true;
        }
        return arr[index] < arr[index + 1] && is_sorted(arr , index+1);
    }
}
