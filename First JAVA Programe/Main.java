
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        System.out.println("hello today");
//        Scanner input = new Scanner(System.in);
//        String hello=input.nextLine();
//        System.out.print(hello);
//    }}
//##########SUM OF TWO NUMBERS GIVEN FROM THE USER######################
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter the first number here : ");
//        int num1=input.nextInt();
//        System.out.println("Please enter the second number here : ");
//        int num2=input.nextInt();
//        System.out.print("sum of both the numbers is : "+ (num1+num2));
//    }
//}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float tempc=in.nextFloat();
        float tempf=(tempc * 9/5)+32;
        System.out.print(tempf);
    }
}
