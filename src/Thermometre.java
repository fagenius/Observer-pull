/*
 * Thermometre.java
 */

/**
 * Thermomètre qui donne la température d'une composante (ConcreteSubject)
 */
public class Thermometre extends AbstractSubject {
  private double temperature;
  
  public Thermometre(double temperature) {
    this.temperature = temperature;
  }
  
  public double getTemperature() {
    return this.temperature;
  }
  
  public void setTemperature(double t) {
    this.temperature = t;
    super.notifyObservers();
  }
  
}
