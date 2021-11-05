import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    
    public static void main(String[] args) throws IOException {
        FileReader fir = new FileReader("C:/Users/91912/Desktop/udemy web dev/FileHandle/file1.txt");
        BufferedReader br = new BufferedReader(fir);
        FileWriter fw = new FileWriter("C:/Users/91912/Desktop/udemy web dev/FileHandle/writer.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line=br.readLine();
        while(line!=null ){
            bw.write(line);
            line = br.readLine();
            
        }
        bw.close();
        fw.close();
        br.close();
        fir.close();
        System.out.println("bbbdone");
    }
}
