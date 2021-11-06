package PracticeQues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// public class   source {
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = s.nextInt();
//         reverseArray(arr);
//         for (int i = 0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");
//     }

//     // Method to reverse the array
//     static void reverseArray(int[] arr) {
//         // Write your code here
//         int high = arr.length - 1;
//         int low = 0;
//         while(low<high){
//             int temp = arr[low];
//             arr[low]=arr[high];
//             arr[high]=temp;
//             low++;
//             high--;
//         }
//     }
// }

public class source {
    public static void main(String args[]) {
        //Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        int[] arr = {5,8,0,15,6,0,1,0,13};
        // for (int i = 0; i < n; i++)
        //     arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

            LinkedList <Integer> li = new LinkedList<Integer>();
            li.add(1);
            System.out.println();
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int pos=999;
        for(int i=0;i<arr.length;i++){
           if((arr[i]==0)&&(pos==999)){
               pos = i;
           } 
           if(arr[i]!=0 && i>pos){
               int temp = arr[i];
               arr[i]=arr[pos];
               arr[pos]=temp;
               pos = giveNextPosition(arr, i, pos);
               
           }
        }
    }
    public static int giveNextPosition(int arr[],int i,int pos){
        int count =0;
        for(int k=pos;k<=i;k++){
            if(arr[k]==0){
                count=k;
                break;
            }
            }
            return count;
}
}

