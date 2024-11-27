import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
  public static void main(String[] args) {
    Boiler boiler = Boiler.getBoiler();

    try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
    
      String line;
      Chocolate c;

      while ((line = reader.readLine()) != null) {
        if (line.equals("Fill")) {
          c = new Chocolate();
          boiler.fill(c);
        }
        if (line.equals("Boil")) {
          boiler.boil();
        }
        if (line.equals("Drain")) {
          boiler.drain();
        }
      }
    }
    catch (Exception e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
  }
}
 
