package edu.kau.fcit.cpit252.observers;

public class WhatsappObserver extends Observer{
    public WhatsappObserver(String recepient) {
        super.setRecipient(recepient);
    }

    @Override
    public void update(String message) {
        System.out.println("Whatsapp Observer:: @"+getRecipient()+ " "+message);
        
    }

}
