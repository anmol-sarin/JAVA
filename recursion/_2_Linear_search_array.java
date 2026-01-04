import java.util.ArrayList;
public class _2_Linear_search_array {
    public static void main(String [] args){
        int [] arr = {23,34,45,45,45,56,67,78};
//        System.out.println(find(arr,56 ,0));
//        System.out.println(findIndex(arr,56 ,0));
//        System.out.println(findAllIndex2(arr,45 ,0,new ArrayList<>()));
//        findingAllIndex(arr,45 ,0);
//        System.out.println(list);
//        ArrayList<Integer> new_list = new ArrayList<Integer>();
//        System.out.println(findAllIndex2(arr,45,0,new_list));
        System.out.println(findAllIndex3(arr,56,0));
    }
    static boolean find(int[] arr,int target , int index){
        if(index == arr.length){
            return false;
        }
        return target == arr[index] || find(arr,target,index+1);
    }
    static int findIndex(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex( arr , target ,index+1 );
    }
    // returning the array of index positions in the case of multiple occurances of target value
    static ArrayList<Integer> list = new ArrayList<>();
    static void findingAllIndex(int[] arr,int target , int index){
        if(index == arr.length){
            return;
        }
        if(target == arr[index]){
            list.add(index);
        }
        findingAllIndex(arr,target,index+1);
    }
    // making an array list inside a function
    static ArrayList<Integer> findAllIndex2(int [] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr,target,index+1,list);
    }
    // avoiding using ArrayList as argument
    // NOTE : *this approach is not optimal as it creates new objects every time the function call happens*
    static ArrayList<Integer> findAllIndex3(int [] arr , int target , int index){
        ArrayList<Integer> ans_list = new ArrayList<>();
        if(index == arr.length){
            return ans_list;
        }
        if(arr[index] == target){
            ans_list.add(index);
        }
        ArrayList<Integer> ans_from_other = findAllIndex3(arr,target,index+1);
        ans_list.addAll(ans_from_other);
        return ans_list;
    }
}
