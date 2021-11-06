package Inheritance;

public class School {
    
}

class University extends School {
    private final String type = "University";
    private boolean isPublic;
    protected int er = 90;
 
    public University(String name, int numStudents, boolean isPublic) {

        this.isPublic = isPublic;
    }
 
    public boolean getIsPublic() {
        return this.isPublic;
    }
 }
 class Test{

    public static void main(String[] args) {
        
    University u = new University("name", 20, true);
    System.out.println(u.er);
    }
 }
