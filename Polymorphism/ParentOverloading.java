package Polymorphism;

import java.io.Console;

public class ParentOverloading {
    
    public void getGo(){
        System.out.println("Pareent");
    }
}

class ChildOverload extends ParentOverloading{

    public void getGo(int a){
        System.out.println(a);
    }
}

class testOverloading{
    public static void main(String[] args) {
        ParentOverloading p = new ChildOverload();
        Console my_console = System.console();
String my_val = my_console.ReadLine(); 
int i = my_val;
System.out.println(i);
    }
}
