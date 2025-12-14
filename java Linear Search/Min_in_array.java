public class Min_in_array {
    public static void main(String[] args) {
        int[] arr={18,34,56,43,12,56};
        mini(arr);
    }
    static void mini(int[] arr){
        int z=arr[0];
        for(int i=0;i<arr.length;i++){
            if(z>arr[i]){
                z=arr[i];
            }
        }
        System.out.println(z);
    }
}
