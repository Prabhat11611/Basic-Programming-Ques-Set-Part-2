package Array;
// Take an array as input from the user. Search for a given number x and print
// the index at which it occurs.

import java.util.*;
public class Array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size=sc.nextInt();

        // Initializing the size in array
        int n[] = new int[size];

        // Taking Input
        for(int i=0; i<size; i++){
            System.out.print("Enter the elements:");
            n[i]=sc.nextInt();
        }

        // Initializing x which we need to search.
        System.out.print("Enter the value to be searched in Array: ");
        int x = sc.nextInt();

        // Output
        for(int i=0; i<size; i++){
            System.out.println(n[i]);
            if(n[i]==x){
                System.out.print(x+" is found at index "+i);
            }
        }
    }
}
