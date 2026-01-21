import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Numbers you entered are "+a+" "+b+" "+c+" ");
        if(a>b && a>c){
            System.out.println("Largest number is : "+a);
        }
        else if(b>c && b>a){
            System.out.println("Largest number is : "+b);
        }
        else{
            System.out.println("largest number is : "+c);
        }
    }
}