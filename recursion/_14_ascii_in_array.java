import java.util.ArrayList;

public class _14_ascii_in_array {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> strings = subseq_ascii("", str);
        System.out.print(strings);
    }

    static ArrayList<String> subseq_ascii(String proce, String unproce) {
        if (unproce.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proce);
            return list;
        }
        char ch = unproce.charAt(0);
        ArrayList<String> first = subseq_ascii(proce + ch, unproce.substring(1));
        ArrayList<String> second = subseq_ascii(proce, unproce.substring(1));
        ArrayList<String> third = subseq_ascii(proce+(ch+0), unproce.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
