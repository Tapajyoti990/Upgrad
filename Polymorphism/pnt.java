package Polymorphism;

public class pnt {
    
}
class cld extends pnt{

}
class white{

}
class blue{

    public static void main(String[] args) {
        pnt p = new cld();
        cld c = (cld)p;
        white w = new white();
        //cld cl=(cld)w; error
        pnt pk = new pnt();
        cld cl = (cld)pk;//reference can be anything child or parent but nothing more than that

    }
}