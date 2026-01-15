import java.util.ArrayList;

public class _12_adding_Subsequence_in_arrayList {
    public static void main(String[] args){
        String str = "abc";
        ArrayList<String> strings = subsequences("",str);
        System.out.print(strings);
    }
    static ArrayList<String> subsequences(String proce,String unproce){
           if(unproce.isEmpty()){
               ArrayList<String>  list = new ArrayList<>();
               list.add(proce);
               return list;
           }
           char ch = unproce.charAt(0);
           ArrayList<String> left = subsequences(proce+ch,unproce.substring(1));
           ArrayList<String> right = subsequences(proce,unproce.substring(1));
        left.addAll(right);
        return left;
    }
}
