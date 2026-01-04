//public class RotatedBinarySearch {
//    public static void main(String[] args){
//        int [] arr = {5,6,7,8,1,2,3};
//        System.out.println(RBS(arr,7 , 0 , arr.length -1));
//    }
//    static int RBS(int [] arr , int target , int s , int e) {
//        if (s > e) {
//            return -1;
//        }
//        int m = s + (e - s) / 2;
//        if (arr[m] == target) {
//            return m;
//        }
//        if (arr[s] <= arr[m]) {
//            if (target >= arr[m] && target <= arr[e]) {
//                return RBS(arr, target, s, m - 1);
//            } else {
//                return RBS(arr, target, m + 1, e);
//            }
//        } else {
//            if (target >= arr[s] && target <= arr[m]) {
//                return RBS(arr, target, m + 1, e);
//            } else {
//                return RBS(arr, target, s, m - 1);
//            }
//        }
//    }
//}
public class _3_RotatedBinarySearch {
    public static void main(String[] args){
        int [] arr = {5, 6, 7, 8, 1, 2, 3};
        System.out.println(RBS(arr, 7, 0, arr.length - 1));  // Expected output: 2
    }

    static int RBS(int[] arr, int target, int s, int e){
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Check if left half is sorted
        if (arr[s] <= arr[m]) {
            // If target is in the left sorted portion
            if (target >= arr[s] && target <= arr[m]) {
                return RBS(arr, target, s, m - 1);
            } else {
                return RBS(arr, target, m + 1, e);
            }
        }
        // Otherwise, right half is sorted
        else {
            if (target >= arr[m] && target <= arr[e]) {
                return RBS(arr, target, m + 1, e);
            } else {
                return RBS(arr, target, s, m - 1);
            }
        }
    }
}
