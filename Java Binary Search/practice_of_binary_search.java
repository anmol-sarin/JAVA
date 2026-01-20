public class practice_of_binary_search {
    public static void main(String[] args){
        int [] arr1={1,2,3,4,5,6,7};
        System.out.print(search(arr1, 5));
    }
    static int search(int [] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
