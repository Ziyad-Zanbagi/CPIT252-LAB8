package edu.kau.fcit.cpit252.observers;

public class TwitterObserver extends Observer{
    public TwitterObserver(String recepient) {
        super.setRecipient(recepient);
    }

    @Override
    public void update(String message) {
        System.out.println("Twitter Observer:: @"+getRecipient()+ " "+message);
        
    }
}
