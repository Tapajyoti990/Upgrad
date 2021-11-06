package Polymorphism;

public class Parent {
    
    public static void run(){//Final,private ya static use mat karna
        System.out.println("Parent Running");
    }

    public void rust(){
        System.out.println("rusted");
    }
}

class Child extends Parent{

    public void run(){
        //rust();
        System.out.println("Child Running");
    }
}

class test{

    public static void main(String[] args) {
        Parent p = new Child();
        p.run();
    }
}