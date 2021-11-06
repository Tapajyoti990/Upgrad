package oopss;

public class StudentDemonstrationEncap {
    
    private String name;
    private int rollNum;
    private double cgpa;

    StudentDemonstrationEncap(String name,int rollNum){
        setName(name);
        setRollNum(rollNum);
    }
    int state = 90;
    public static void play(){
        state=89;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int getRollNum() {
        return rollNum;
    }
    public String getName() {
        return name;
    }
    private void setRollNum(int rollNum) {
        if(rollNum>0)
        this.rollNum = rollNum;
    }
    private void setName(String name) {
        if(!(name.trim().compareTo("")==0))
        this.name = name;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class Mains{

    public static void main(String[] args) {
        StudentDemonstrationEncap st = new StudentDemonstrationEncap("Kunal", 1456);
       System.out.println(st.getCgpa());
       st.setCgpa(9.7);
       System.out.println(st.getCgpa());
    }
}
