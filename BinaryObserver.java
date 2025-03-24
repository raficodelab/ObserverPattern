public class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject) {
      this.subject = subject;
      this.subject.attach(this); // Attach this observer to the subject
   }

   @Override
   public void update() {
      System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
   }
}
