import java.util.*;
public class Array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size= sc.nextInt();

        int numbers[] = new int[size];

        // Input
        for(int i=0; i<size; i++){
            System.out.print("Enter the Elements: ");
            numbers[i]=sc.nextInt();
        }

        // Output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
