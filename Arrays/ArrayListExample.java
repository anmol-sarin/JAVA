import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list1=new ArrayList<>(5);
        list1.add(189);
        list1.add(19);
        list1.add(89);
        list1.add(18);
        list1.add(218);
        list1.add(21);
        //updating the values
        list1.set(3,34);
//        System.out.println(list1);
        //contains function
//        System.out.println(list1.contains(24));
//        System.out.println(list1.contains(34));
        list1.remove(2);
//        System.out.println(list1);
        ArrayList<Integer> list2 =new ArrayList<>(5);
        //input
        for(int i=0;i<5;i++){
            list2.add(in.nextInt());
        }
        //get function
        for(int j=0;j<5;j++){
            System.out.println(list2.get(j));
        }
        System.out.print(list2);

    }
}
