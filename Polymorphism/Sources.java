import java.util.*;
import java.math.BigDecimal;
abstract class Homeloan {
    double amount;
    int time;

    //Write your code here
    abstract double getRateOfIntererst();
    abstract double simpleInterest();
}

class Bank1 extends Homeloan {

    //Write your code here
    double RateOfInterest = 7.2;
    Bank1(double amount,int time){
        this.amount = amount;
        this.time = time;
    }
    double getRateOfIntererst(){
        return RateOfInterest;
    }
    double simpleInterest() {

        //Write your code here
       
         double interest = (this.amount * this.time * this.getRateOfIntererst())/100;
         interest = Math.round(interest*100000)/100000;
       return interest;
   }

}

class Bank2 extends Homeloan {

   //Write your code here
   double RateOfInterest = 8.1;
   Bank2(double amount,int time){
       this.amount = amount;
       this.time = time;
   }
   double getRateOfIntererst(){
       return RateOfInterest;
   }
   double simpleInterest() {

       //Write your code here
    double interest = (this.amount * this.time * this.getRateOfIntererst())/100;
       return interest;
   }
}

public class Sources {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        if(amount<=0)
        {
            System.out.println("invalid input");
        }else{
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println((Math.round((obj1.simpleInterest()+obj1.amount)*100000))/100000.0);
        } else {
            System.out.println("File for a loan in Bank2");
                       System.out.println((Math.round((obj1.simpleInterest()+obj1.amount)*100000))/100000.0);
        }
    }

}
}