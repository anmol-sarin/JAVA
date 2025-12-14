/*input
{
{1,2,3},
{4,5,6}
}
here the first array {1,2,3} represents the wealth of first person and 1+2+3 = 6 is the total wealth of first person
and second array {4,5,6} represents the wealth of second person and 4+5+6 = 15 is the total wealth of second person
we have to find the richest person
 */
public class max_wealth_problem {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,9},
                {3,2,1,5},
                {4,3,2}
        };
        int max=accounts(arr);
        System.out.println(max);
    }
    static int accounts(int[][] arr ){
        int max=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
                sum+=arr[row][col];
            }
            if(max>sum){
                max=sum;
            }
        }
        return max;
    }
}
