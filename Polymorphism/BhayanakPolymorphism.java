package Polymorphism;

public class BhayanakPolymorphism {
    
    public void getDetails(){

        this.compute();
    }
    public void compute(){
        System.out.println("Computing parent");
    }
}

class cbp extends BhayanakPolymorphism{

    public void getBro(){
        this.getDetails();
    }

    public void compute(){

        System.out.println("Computing Child");
    }
}

class Tbp{

    public static void main(String[] args) {
        cbp c = new cbp();
        c.getBro();
    }
}