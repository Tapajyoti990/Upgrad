import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        FileReader fir = new FileReader("C:/Users/91912/Desktop/udemy web dev/FileHandle/numbers.txt");
        BufferedReader br = new BufferedReader(fir);
        String line=br.readLine();
        int sum=0;
        while(line!=null){
        sum = sum+Integer.parseInt(line);
        line = br.readLine();
        }
        System.out.println(sum);
    }
}
