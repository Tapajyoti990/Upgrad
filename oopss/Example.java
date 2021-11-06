package oopss;
class Superclass
{
    public Superclass()
    {
        System.out.println("This is Super class constructor");

        System.out.println(this.getClass().getName());
    }
}

class Subclass extends Superclass
{
    public Subclass()
    {
        System.out.println("This is Subclass constructor");

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName());
    }
}

public class Example
{
    public static void main(String[] args)
    {
        Subclass Obje = new Subclass();
    }
}