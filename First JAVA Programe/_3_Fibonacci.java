import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    int a=0;
    int b=1;
    int temp;
    int i=2;
        System.out.print(a +" "+b);
    while (i<num){
        temp=b;
        b=a+b;
        a=temp;
        i++;
//        System.out.println("a = "+a);
        System.out.print(" "+b+" ");
    }

//    System.out.print(b);
    }
}
