class Main {

    public static void main(String[] args) {

        
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Size of matrix (since it is N x N)
        int N = arr.length;

        /*
         Clockwise 90° Rotation Logic:
         
         We print column by column.
         For each column j:
            print elements from bottom row to top row
         
         Example:
         Original:
         1 2 3
         4 5 6
         7 8 9
         
         Rotated Output:
         7 4 1
         8 5 2
         9 6 3
        */

        // Outer loop → column
        for (int j = 0; j < N; j++) {

            // Inner loop → row (reverse order)
            for (int i = N - 1; i >= 0; i--) {

                // Print rotated element
                System.out.print(arr[i][j]);

                // Print space except after last element
                if (i > 0) {
                    System.out.print(" ");
                }
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
