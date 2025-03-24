import observer.eventarmanagerment.SMSSupportListener;
import observer.eventarmanagerment.SMSReceiver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Creating Subject and observers
        Subject subject = new Subject();
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        // Demonstrating Subject/Observer pattern with state change
        System.out.println("First state change: 15");
        subject.setState(15);

        // Detaching an observer
        subject.detach(binaryObserver);
        System.out.println("Second state change: 10");
        subject.setState(10);

        // Demonstrating SMS Support Listener
        SMSSupportListener smsListener = new SMSSupportListener();
        SMSReceiver smsReceiver = new SMSReceiver(smsListener);

        // Receiving SMS with length greater than 100 characters
        String longSMS = "This is a long SMS message that exceeds the 100 character limit. " +
                         "It is used to trigger the warning functionality.";
        smsReceiver.receiveSMS(longSMS);

        // Receiving SMS within the acceptable limit
        String shortSMS = "Short SMS.";
        smsReceiver.receiveSMS(shortSMS);
    }
}
