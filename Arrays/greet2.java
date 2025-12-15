public class greet2 {
    public static void main(String[] args){
        String name="a";
        change(name);
        System.out.print("name outside change "+name);
    }
    static void change(String name){
        name="b";
        System.out.println("name inside change "+ name);
    }
}
