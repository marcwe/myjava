import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class ScannerReadFile {
 
    public static void main(String[] args) {
 
        // Location of file to read
        File file = new File("data.txt");
 
        try {
 
            Scanner scanner = new Scanner(file);
 
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
		System.out.println("mw");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 
    }
}