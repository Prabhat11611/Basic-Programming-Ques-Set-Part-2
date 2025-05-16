package Array;
// Take an array of names as input from user and print them on the screen.

import java.util.*;
public class Array4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size=sc.nextInt();

        String names [] = new String[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the names of the students: ");
            names[i]=sc.next();
        }

        // Method-01
        // for(int i=0; i<size; i++){
        // Method-02
        for(int i=0; i<names.length; i++){
            System.out.println("Entered name is: "+names[i]);
        }
    }
}
