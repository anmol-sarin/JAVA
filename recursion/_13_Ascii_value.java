public class _13_Ascii_value {
    public static void main(String[] args){
        String str = "abc";
        Ascii("",str);

    }
    static void Ascii(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + "  ");
            return ;
        }
        char ch = up.charAt(0);
        Ascii(p+ch,up.substring(1));
        Ascii(p,up.substring(1));
        Ascii(p+(ch+0),up.substring(1));
    }
}
