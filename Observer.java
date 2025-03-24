public abstract class Observer {
   protected Subject subject; // Reference to the subject
   public abstract void update(); // Abstract method to be implemented by concrete observers
}
