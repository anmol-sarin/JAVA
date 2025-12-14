//find the number of elements that have even number of digits

public class no_of_even_digits_problem {
    public static void main(String[] args){
        int [] arr={185,273,1,45,67};
        int ans=no_of_dig(arr);
        System.out.print(ans);
    }
    static int no_of_dig(int [] arr){
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(checker(arr[i])){
                counter++;
            }
        }
        return counter;
    }
    static boolean checker(int num) {
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count % 2==0;
        }
}
