package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    
    public static void main(String[] args) {
        // ArrayList al = new ArrayList();
        // al.add(1);
        // al.add(2);
        // al.add(2,3);
        // System.out.println(al);

        // ArrayList<String> shape = new ArrayList<String>();
        // 	shape.add("Square");
        // 	shape.add("Triangle");
        // 	shape.add(2, "Circle");
        // 	//shape.add(1, "Rhombus");
        // 	System.out.println(shape.get(2));

        ArrayList<Float> al = new ArrayList<Float>();
        al.add(5f);
        al.add(6f);
        al.add(7f);
        // System.out.println(al.get(0));
        // System.out.println(al.contains(5.0));
        // System.out.println(al.contains(5f));
        ListIterator li = al.listIterator(2);
        System.out.println(li.next());
        if(li.hasPrevious()){
            System.out.println(li.previous());
            li.remove();
        }
        li.previous();
        li.add(21f);
        System.out.println(al);
    }
}




class Source {

   public static void main(String[] args) {
       List<Float> random = new ArrayList<Float>();
       random.add(2f);
       random.add(4f);
       random.add(5f);
       random.add(10f);
       random.add(99.9f);
       random.add(101f);

       printList(random);
   }

   public static void printList(List<Float> arr) {

       ListIterator li = arr.listIterator(arr.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
   }
}

class Rectangle{
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
    public void meth1(){
        System.out.println("parent");
    }
}
class Square extends Rectangle{
	
	public void printNameofClass(){	 
		System.out.println("Square");
	}
    public void meth1(){
        System.out.println("Child");
    }
}

 class AnnotationDemo{
	public static void main(String[] args){
		Square s = new Square();
		s.meth1();
	}	
}