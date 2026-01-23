public class patterns {
    public static void main(String[] args) {
        pattern31(4);
    }

    /*
    //////////
    pattern 1
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    //////////
    */
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    pattern 2
    *
    * *
    * * *
    * * * *
    */
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    pattern 3
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    pattern 4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    pattern 5
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
     */
    static void pattern5(int n) {
        for (int row = 0; row <= n * 2; row++) {
            int indexAtCols = row > n ? 2 * n - row : row;
/*            ///explaination of line 83///////////
            int indexAtCols;
            if (row > n) {
                indexAtCols = 2 * n - row;
            } else {
                indexAtCols = row;
            }                                         */
            for (int col = 0; col <= indexAtCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*    pattern 28
     *
     * *
     * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int numOfCol = row > n ? 2 * n - row : row;
            int numOfSpace = n - numOfCol;
            for (int s = 0; s < numOfSpace; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= numOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    pattern 30
         1
        212
       32123
      4321234
     543212345
     */
    static void pattern30(int n) {
        for (int row = 1; row<=n; row++) {
            for(int s = 0 ; s<n-row ; s++ ){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
/*
 pattern 31
        4 4 4 4 4 4 4
        4 3 3 3 3 3 4
        4 3 2 2 2 3 4
        4 3 2 1 2 3 4
        4 3 2 2 2 3 4
        4 3 3 3 3 3 4
        4 4 4 4 4 4 4

 */
static void pattern31(int n){
    int original=n;
    n=2*n;
    for(int row=0;row<=n;row++){
        for(int col=0;col<=n;col++){
            int num=original - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(num+" ");
        }
        System.out.println();
    }
}
}
