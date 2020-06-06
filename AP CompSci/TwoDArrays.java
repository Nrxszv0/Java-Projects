public class TwoDArrays {
    public static void main(String[] args) {
        int[] bScores = {45,22,86,99,100 };
        //8.1 2D Arrays
        int[][] arr = new int[3][3]; // 3 rows and 3 columns
        //8.2 Traversing a 2 array
        int [][] board = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int row=0;row<3;row++) {
            for(int col=0;col<3;col++) {
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();
        }
        // Traversing an array with enhanced for loop
        for(int[]row:board) {
            for(int value:row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        //Standard algorithms
        //Finding max value
        int[][] scores = {{23, 45, 26,}, {98, 76, 59}};
        int maxVal = scores[0][0];
        for(int row=0;row<2;row++) {
            for(int col=0;col<2;col++) {
                if(scores[row][col] > maxVal) {
                   maxVal =scores[row][col];
                }
            }
        }
        System.out.println(maxVal);;
        
    }
}
