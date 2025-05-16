import java.util.*;
public class Array2Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int col=sc.nextInt();

        int n[][]=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                n[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}