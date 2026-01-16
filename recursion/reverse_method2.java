//    public static void main(String[] args){
//        System.out.println((int)Math.pow(2,2));
//        System.out.println(rev2(5478,4));
//        int num = 12345;
//        System.out.print((int)Math.log10(num));
//    }
//    static int rev2(int num,int length){
//        if(num==0){
//            return 0;
//        }
//        int rem = num%10;
//        int power = (int) Math.pow(10,length-1);
//        int ans = (rem * power);
//        return ans + rev2(num/10,length-1);
//    }
//}
public class reverse_method2 {
    public static void main(String [] args){
        System.out.print(rev2(34526));
    }
    static int rev2(int num){
        int digits = (int) Math.log10(num)+1;
        return helper(num,digits);
    }
    static int helper(int number,int length){
        if (number/10 == 0){
            return number;
        }
        int rem = number % 10;
        int power = (int)Math.pow(10,length -1);
        return rem*power + helper(number/10,length-1);
    }
}