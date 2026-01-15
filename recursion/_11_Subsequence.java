public class _11_Subsequence {
    public static void main(String[] args){
        String str = "anmol";
        subsequence("",str);
    }
    static void subsequence(String proce , String unproce){
        if(unproce == ""){
            System.out.print(proce + " , ");
            return;
        }
        char ch = unproce.charAt(0);
        subsequence(proce+ch , unproce.substring(1));
        subsequence(proce,unproce.substring(1));
    }
}
