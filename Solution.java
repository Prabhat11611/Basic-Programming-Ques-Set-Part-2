// import java.util.*;

// public class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of an Array: ");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter the Elements at index "+i+": ");
//             numbers[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target element: ");
//         int target = sc.nextInt();

//         // Iterate through the array for finding the elements whose sum will be equal to target element.
//         // for (int i = 0; i < size; i++) {
//         //     int add = i + (i + 1);
//         //     if (add == target) {
//         //         System.out.print("Element found at index: " + i);
//         //     }
//         // }

//         for(int i=0; i<size; i++){
//             for(int j=0; j<size; j++){
//                 if(numbers[i]+numbers[j]==target){
//                     System.out.println("Indices of the two numbers: "+i+" and "+j);
//                     return;
//                 }
//             }
//         }
//     }
// }






// //   Question 2
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         // Initialize a variable to keep track of the unique elements
//         int k = 0;
        
//         // Iterate through the array starting from the second element
//         for (int i = 1; i < nums.length; i++) {
//             // Check if the current element is different from the previous one
//             if (nums[i] != nums[k]) {
//                 // If it's different, increment k and assign the current element to nums[k]
//                 k++;
//                 nums[k] = nums[i];
//             }
//         }
        
//         // The length of the resulting array is k + 1
//         // The first k + 1 elements of nums are the unique elements
//         return k + 1;
//     }
// }





// //    Question 3
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k = 0; // Initialize a variable to keep track of the non-target elements
        
//         // Iterate through the array
//         for (int i = 0; i < nums.length; i++) {
//             // If the current element is not equal to the target value,
//             // copy it to the position indicated by k
//             if (nums[i] != val) {
//                 nums[k] = nums[i];
//                 k++; // Increment k to indicate the next available position
//             }
//         }
        
//         // The value of k represents the length of the resulting array
//         return k;
//     }
// }





// Question 4
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy elements from nums1 and nums2 to temporary arrays
        int[] temp1 = new int[m];
        int[] temp2 = new int[n];
        for (int i = 0; i < m; i++) {
            temp1[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            temp2[j] = nums2[j];
        }
        // Merge the arrays back into nums1
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (temp1[i] <= temp2[j]) {
                nums1[k] = temp1[i];
                i++;
            } else {
                nums1[k] = temp2[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from temp1, if any
        while (i < m) {
            nums1[k] = temp1[i];
            i++;
            k++;
        }
        // Copy remaining elements from temp2, if any
        while (j < n) {
            nums1[k] = temp2[j];
            j++;
            k++;
        }
    }
}
