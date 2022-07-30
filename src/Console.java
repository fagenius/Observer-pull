/*
 * Console.java
 */

/**
 * Console de surveillance (ConcreteObserver)
 */
public class Console implements IObserver {
  private Thermometre thermometre;
  
  public Console(Thermometre t) {
    this.thermometre = t;
  }
  
  public void update() {
    double t = this.thermometre.getTemperature();
    System.out.println("Console : Température actuelle = " + t);
  }
  
}
