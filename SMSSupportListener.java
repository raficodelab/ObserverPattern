package observer.eventarmanagerment;

public class SMSSupportListener {

    // This method checks the SMS length and gives a warning if it's more than 100 characters
    public void onSMSReceived(String smsContent) {
        if (smsContent.length() > 100) {
            System.out.println("Warning: SMS content exceeds 100 characters!");
        } else {
            System.out.println("SMS content is within the acceptable length.");
        }
    }
}
