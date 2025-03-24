package observer.eventarmanagerment;

public class SMSReceiver {

    private SMSSupportListener smsSupportListener;

    public SMSReceiver(SMSSupportListener smsSupportListener) {
        this.smsSupportListener = smsSupportListener;
    }

    public void receiveSMS(String smsContent) {
        System.out.println("Receiving SMS: " + smsContent);
        smsSupportListener.onSMSReceived(smsContent);  // Notify the listener
    }
}
