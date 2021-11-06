package Inheritance;

public class Child extends Parenr{
    
    Child(int a){
        this.a = a;
    }
        Child(){

        }
    public void getA()
    {
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.getA();

        Child ch = new Child(50);
        ch.getA();
    }
}
