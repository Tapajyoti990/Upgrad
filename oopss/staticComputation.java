package oopss;

public class staticComputation {
    
    static int num = 2;

    public void compute(){
        System.out.println(num+1);
    }
}

class Main{

    public static void main(String[] args) {
        
        staticComputation s1 = new staticComputation();
        staticComputation s2 = new staticComputation();

        s1.compute();
        s2.compute();

        s1.num = 90;
        s1.compute();
        s2.compute();
    }
}
