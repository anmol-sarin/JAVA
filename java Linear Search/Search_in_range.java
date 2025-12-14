
public class Search_in_range {
    public static void main(String[] args){
        int[] arr={18,34,56,43,12,56};
        search_in_range(arr,11,1,4);
    }
    static void search_in_range(int[] arr,int target,int start,int end){
        for(int i = start;i<=end;i++){
            if(target==arr[i]){
                System.out.print("Item found!!");
            }
        }

    }
}
