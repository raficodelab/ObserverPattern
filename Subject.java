import java.util.ArrayList;
import java.util.List;

public class Subject {
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers(); // Notify observers when state changes
   }

   public void attach(Observer observer) {
      observers.add(observer); // Add observer to list
   }
public void detach(Observer observer) {
        observers.remove(observer);  // Remove the observer from the list
    }
   public void notifyAllObservers() {
      for (Observer observer : observers) {
         observer.update(); // Call the update method of each observer
      }
   }
}
