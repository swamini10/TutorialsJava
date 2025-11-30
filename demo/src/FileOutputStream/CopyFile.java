package FileOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) {
    // Copy image.jpg into copy.jpg
    try (FileInputStream input = new FileInputStream("C:\\Users\\swamini\\OneDrive\\Desktop\\TutorialsJava\\demo\\src\\Files\\image.JPG");
         FileOutputStream output = new FileOutputStream("copy.jpg")) {

      int b;
      while ((b = input.read()) != -1) {
        output.write(b);  // write each raw byte to the new file
      }
      System.out.println("copied successfully.");
    } catch (IOException e) {
      System.out.println("Error handling file.");
    }
  }
}
