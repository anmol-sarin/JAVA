public class order_agnostic_binary_search {
    public static void main(String[] args){
        int [] arr1={75,64,53,51,32,22,17,1};
        int [] arr2={5,24,56,76,87,89,98};
        int ans1=binary_searching(arr1,17);
        int ans2=binary_searching(arr2,87);
        System.out.print(ans1 +"  "+ ans2);
    }
    static boolean is_asc(int [] arr){
        int start=0;
        int end=arr.length-1;
        if (arr[start]<arr[end]){
            return true;
        }
        else{
            return false;
        }
    }
    static int binary_searching(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(is_asc(arr)){
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
        }
        else{
            while(start<=end){
                int mid=start + (end-start)/2 ;
                if(arr[mid] > target){
                    start=mid+1;
                } else if (arr[mid] < target) {
                    end=mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
//    static void binary_searching(int [ ] arr,int target){
//        int start=0;
//        int end=arr.length - 1;
//        if(arr[start]<arr[end]){
//            while(start<=end){
//                int mid = start + (end - start)/2;
//                if(arr[mid] == target){
//                    System.out.print("item found Item found at "+ mid);
//                }
//                else if(arr[mid]<target){
//                    start=mid+1;
//                }
//                else{
//                    end=mid-1;
//                }
//            }
//            System.out.print("Item not found");
//        }
//        else{
//            while(start<=end){
//                int mid = start + (end - start)/2;
//                if(arr[mid] == target){
//                    System.out.print("item found Item found at "+ mid);
//                }
//                else if(arr[mid]<target){
//                    end=mid-1;
//
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            System.out.print("Item not found");
//        }
//    }
}
