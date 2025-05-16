package Array;
// Find the maximum and minimum number in an array of integers.

import java.util.*;
public class Array5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        int number[]= new int[size];

        // Taking Input form the user
        for(int i=0; i<size; i++){
            System.out.print("Enter "+ (i+1) +" number to insert inside an Array: ");
            number[i]=sc.nextInt();
        }
        
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(number[i]<min){
                min = number[i];
            }
            if(number[i]>max){
                max = number[i];
            }
        }
        System.out.println("Largest number is: "+max);
        System.out.println("Smallest number is: "+min);
    }
}
