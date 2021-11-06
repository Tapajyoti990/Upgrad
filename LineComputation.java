import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineComputation {
    
    public static void main(String[] args) throws IOException {
        FileReader fir = new FileReader("C:/Users/91912/Desktop/udemy web dev/FileHandle/file1.txt");
        BufferedReader br = new BufferedReader(fir);
        String line = br.readLine();
        System.out.println(line);
        br.close();
        fir.close();
    }
}
