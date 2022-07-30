/*
 * Journal.java
 */

/**
 * Journal des changements de temp�rature (ConcreteObserver)
 */
public class Journal implements IObserver {
  private Thermometre thermometre;
  
  public Journal(Thermometre t) {
    this.thermometre = t;
  }
  
  public void update() {
    double t = this.thermometre.getTemperature();
    System.out.println("Journal : " + System.nanoTime() + " " + t);
  }
  
}
