import java.util.*;
public class Array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking input for number of rows and columns.
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols=sc.nextInt();

        // Declaring an Array
        int[][] numbers=new int[rows][cols];
        // For 2D Arrays we use Nested Loops, now in this the outer loop cotrols our Rows and inner loop controls our Columns.

        // Input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
