import java.util.Scanner;
public class proctice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int ans=0;
        while(num1>0){
            int rem=num1%10;
            ans = ans+rem;
            num1/=10;
        }
        System.out.print(ans);
    }
}
