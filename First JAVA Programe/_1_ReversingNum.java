public class ReversingNum {
    public static void main(String[] args){
        int num = 129345;
        int a=0;
        int ans=0;
        while(num>0){
            ans=(num%10)*10^a;
            a++;
        }
        System.out.print(ans);
    }
}
