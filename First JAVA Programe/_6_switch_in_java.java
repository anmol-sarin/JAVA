import java.util.Scanner;
public class switch_in_java {
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String fruits=in.next();
    switch (fruits) {
        case "mango" -> System.out.print("its yellow in colour ");
        case "apple" -> System.out.print("its red in colour ");
        case "grapes" -> System.out.print("Its green in colour ");
        case "banana" -> System.out.print("Its yellow in colour ");
        default -> System.out.print("Please enter valid fruit ");
    }
}
}

