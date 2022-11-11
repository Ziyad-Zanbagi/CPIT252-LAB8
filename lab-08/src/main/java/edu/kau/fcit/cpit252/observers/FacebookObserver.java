package edu.kau.fcit.cpit252.observers;

public class FacebookObserver extends Observer{
    public FacebookObserver(String recepient) {
        super.setRecipient(recepient);
    }

    @Override
    public void update(String message) {
        System.out.println("Facebook Observer:: @"+getRecipient()+ " "+message);
        
    }
}
