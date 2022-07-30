/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    Thermometre thermometre = new Thermometre(0);
    
    Console console = new Console(thermometre);
    thermometre.register(console);
    
    Journal journal = new Journal(thermometre);
    thermometre.register(journal);
    
    thermometre.setTemperature(5);
    thermometre.setTemperature(7);
  }
  
}
