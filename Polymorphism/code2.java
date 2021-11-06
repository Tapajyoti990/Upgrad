package Polymorphism;

public class code2 {
    
}
class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    public default void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class Source extends Base implements BaseInterface {

    public static void main(String[] args) {

        Source obj = new Source();
        obj.display();
    }
}