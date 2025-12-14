import java.util.Scanner;
public class searching_in_string {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the name in which you want to check : ");
        String namee=in.next();
        System.out.print("enter the character to be checked : ");
        char charac=in.next().charAt(0);
        if(checker(namee,charac)==true){
            System.out.println("character found !!");
        }
        else{
        System.out.println("Character not found !!");
        }
    }
    static boolean checker(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (char i:name.toCharArray()){
            if(target == i){
               return true;
            }
        }
//        for (int i=0;i<name.length();i++){
//            if(target == name.charAt(i)){
//                return true;
//            }
//        }
        return false;
    }
}
