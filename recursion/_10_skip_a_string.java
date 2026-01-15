public class _10_skip_a_string {
    public static void main(String[] args){
        String ans = skiped("bdapplfg","apple","app");
        System.out.print(ans);
    }
    static String skiped(String str ,String present, String skip_portion){
        if(str.isEmpty()){
            return "";
        }
        int len = skip_portion.length();
        if(str.startsWith(skip_portion) && !str.startsWith(present)){
            return skiped(str.substring(len),present,skip_portion);
        }else{
            return str.charAt(0)+skiped(str.substring(1),present,skip_portion);
        }
    }
}
