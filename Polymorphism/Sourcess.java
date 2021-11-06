package Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class absdetail{
	//Include a member variable named father
	String father;
	abstract String getFather();
	abstract void setFatherName(String name);
	//Include getter and setter methods for this variable
}

interface year{
    //TODO
     int getYear(int year);
}

class Student extends absdetail{
	public String name = null;
	public int ANo;
	public int STD;

	public Student(String name, int ANo, int STD) {
		this.name = name;
		this.ANo = ANo;
		this.STD = STD;
	}
	public String getFather(){
	    return this.father;
	}
	public void setFatherName(String father){
	    this.father = father;
	}
	//Define the methods here

	public String getName() {
		return name;
	}

	public int getANo() {
		return ANo;
	}

	public int STD() {
		return STD;
	}
}

class Report extends Student implements year{

	public int ptage;
	public String pass = null;
	public Report(String name, int ANo, int STD, int ptage, String pass) {
		super(name, ANo, STD);
		this.ptage = ptage;
		this.pass = pass;
	}
	public int getptage() {
		return ptage;
	}
	public String getpass() {
		return pass;
	}
	//implement the method here
	public int getYear(int year){
	    return (12-year);
	}
}

class Bus extends Student {
	public int route;
	public String BG = null;
	public Bus(String name, int ANo, int STD, int route, String BG) {
		super(name, ANo, STD);
		this.BG = BG;
		this.route = route;
	}
	public String getBG() {
		return BG;
	}
	public int getroute() {
		return route;
	}
}

public class Sourcess {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
    	strNums1 = br.readLine().split("\\s");







































































































































































































































































































































        
    	strNums2 = br.readLine().split("\\s");
    	Report r1 = new Report(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[3]),strNums1[4]);
    	Report r2 = new Report(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[3]),strNums2[4]);
    	Bus b1 = new Bus(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[5]),strNums1[6]);
    	Bus b2 = new Bus(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[5]),strNums2[6]);
    	//call setFather for all objects here
    	int n = Integer.parseInt(br.readLine());
    	if(n==r1.getANo()) {
    		System.out.println(r1.getName() +" "+ r1.getptage() + " "+b1.getroute()+ " "+b1.getFather());
    		System.out.println("You will graduate in " + r1.getYear(r1.STD)+ " years");
    	}
    	else if(n==r2.getANo()){
    		System.out.println(r2.getName() +" "+ r2.getptage() + " "+b2.getroute()+ " "+b2.getFather());
    		System.out.println("You will graduate in " + r2.getYear(r2.STD)+ " years");
    	}	
    	else
    		System.out.println("No entry found");
    }
}

abstract class pnt{
    abstract public void sit();
}

abstract class pnt1 extends pnt{

}