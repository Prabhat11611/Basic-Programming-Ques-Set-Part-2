// Take a matrix as input from the user. Search for a given number x and 
// print the indices at which it occurs.

import java.util.*;
public class Array2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols=sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // Outer Loop
        for(int i=0; i<rows; i++){
            // Inner Loop
            for(int j=0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the number to be searched from the matrices: ");
        int x=sc.nextInt();
        
        // Traversing on each and every elements on Matrix.
        // Outer Loop
        for(int i=0; i<rows; i++){
            // Inner Loop
            for(int j=0; j<cols; j++){
                // System.out.print(numbers[i][j]+ " ");
                if(x==numbers[i][j]){
                    System.out.print("This number is found at location ("+i+", "+j+" )");
                }
            }
            System.out.println();
        }
    }
}
