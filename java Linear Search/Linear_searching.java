public class Linear_searching {
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55,66};
        System.out.println(linear_search(arr,55));
        if(linear_search(arr,55)==-1){
            System.out.print("Item not found");
        }
        else{
            System.out.print("Item found at index position "+linear_search(arr,55));
        }
    }
    static int linear_search(int [] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
