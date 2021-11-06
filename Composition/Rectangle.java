package Composition;

public class Rectangle {
    
    Rectangle(int a,int b){
        this.upperLeftX = a;
        this.upperLeftY = b;
    }
    int upperLeftX;
    int upperLeftY;
    Point p1 = new Point(upperLeftX,upperLeftY);

    public void getPt(){
        System.out.println(p1.x);
        System.out.println(p1.y);
    }
}
