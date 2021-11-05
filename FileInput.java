import java.io.FileReader;

public class FileInput {
    
    public static void main(String[] args) {
        
        try{
        FileReader fin = new FileReader("C:/Users/91912/Desktop/udemy web dev/FileHandle/file1.txt");
        int ch=fin.read();
        while(ch!=-1){
            System.out.print((char)ch);
            ch=fin.read();
        }
        fin.close();
    }catch(Exception e){
        System.out.println("Caaught");

    }
    
}
}
