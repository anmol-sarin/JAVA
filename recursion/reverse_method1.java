public class reverse_method1 {
    public static void main(String[] argts){
        reverse(8475);
        System.out.print(sum);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return ;
        }
        int rem = n % 10;
        sum =  sum * 10 + rem;
        reverse(n/10);
    }
}
