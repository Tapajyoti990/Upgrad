package Polymorphism;

// public class BhayankarPolymorphism {
    
// }
// interface first {
//     default public void display() {
//         System.out.println("This is the display function of method1");
//     }
// }

// interface second {
//     default public void display() {
//         System.out.println("This is the display function of method2");
//     }
// }

// public class Source implements first, second {
//     public void display(){
        
//     }
//     public static void main(String[] args) {
//         Source object = new Source();
//         object.display();
//     }
// }

import java.util.ArrayList;                  //ArrayList library imported
import java.util.Scanner;

// class Source {
//    public static void main(String[] args) {
//       // int random[ ] = {2, 4, 5, 10};       
//        //Declare and create an object of the ArrayList class named 'random', in place of the line above
//        ArrayList  random = new ArrayList();
//        random.add(2);
//         random.add(4);
//          random.add(5);
//           random.add(10);

//       //Add the first four elements to this 'random' ArrayList

//        //random.add(99);                    //Command for adding a new element
//        printArray(random);
//    }

//    public static void printArray(ArrayList arr) {   //Change the type of the parameter to ArrayList
//        for(Object a : arr) {    //Change the data type of 'a' from 'int' to 'Object'
       
//            System.out.println((Integer)a);
//        }
//    }
// }

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        int low = 0;
        int high = list.size()-1;
        while(low<high){
            Integer temp = list.get(low);
            list.set(low, list.get(high));
            list.set(high, temp);
            low++;
            high--;
        }
    }
}