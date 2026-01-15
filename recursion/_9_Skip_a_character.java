public class _9_Skip_a_character {
    public static void main(String[] args){
//        String ans = skipChar("anmol sarin",'a');
        skip("","anmol sarin");
//        System.out.println("answer is : "+ans);
    }
    static void skip(String processed , String Unprocessed){
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = Unprocessed.charAt(0);

        if(ch == 'a'){
            skip(processed,Unprocessed.substring(1));
        }else{
            skip(processed+ch,Unprocessed.substring(1));
        }
    }
    static String skipChar(String str, char skip) {
        String ans = "";
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);

        if (ch == skip) {
            return skipChar(str.substring(1), skip);
        } else {
            return ans + ch + skipChar(str.substring(1), skip);
        }
    }
}
