/*
 * AbstractSubject.java
 */
import java.util.ArrayList;

/**
 * Abstract Subject (AbstractSubject)
 */
public class AbstractSubject {
  private ArrayList<IObserver> observers;
  
  public AbstractSubject() {
    this.observers = new ArrayList<IObserver>();
  }
  
  public void register(IObserver o) {
    this.observers.add(o);
  }
  
  public void unregister(IObserver o) {
    this.observers.remove(o);
  }
  
  public void notifyObservers() {
    for (IObserver o : this.observers) {
      o.update();
    }
  }
  
}
