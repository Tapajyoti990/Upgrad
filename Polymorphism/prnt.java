package Polymorphism;

public class prnt {
    int kp=1;
    int a=20;
    public void printDetails(){
        System.out.println("Parent");
    }
    public void printA(){
        System.out.println(this.a);
    }
    public void printKp(){
        System.out.println(this.kp);
    }
}

class chldd extends prnt{

    int kp=2;
    chldd(int a){
        this.a = a;
    }
    chldd(){

    }
    public void printDetails(){
        System.out.println("Child");
        super.printDetails();
    }
    // public void printKp(){
    //     System.out.println(this.kp);
    // }
    
}

class tesssttt{
    public static void main(String[] args) {
        prnt p = new chldd();
        p.printDetails();

        chldd c1 = new chldd(23);
        c1.printA();
        prnt p2 = new chldd(24);
        p2.printA();

        p2.printKp();
        c1.printKp();
        System.out.println(p2.kp);
        System.out.println(c1.kp);
    }
}
