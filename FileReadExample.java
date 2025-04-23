import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\CSE-Lab1\\Downloads\\JAVA\\AV.SC.U4CSE24151 CODES\\myjava.txt"));
            String line; 
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }     
            br.close();
        } 
       
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
