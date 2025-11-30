package FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
   
    String text = "Swamini bhandare are u there ";
    try (FileOutputStream output = new FileOutputStream(
            "C:\\Users\\swamini\\OneDrive\\Desktop\\TutorialsJava\\demo\\src\\FileOutputStream\\filename.txt")) {
      output.write(text.getBytes());  
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
      e.printStackTrace();
    }
  }
}