package edu.kau.fcit.cpit252.observers;

import javax.mail.search.RecipientStringTerm;

import edu.kau.fcit.cpit252.utils.SendEmail;

public class EmailObserver extends Observer{

    public EmailObserver(String recepient) {
        super.setRecipient(recepient);
    }

    @Override
    public void update(String message) {
        System.out.println("Email Observer:: @"+getRecipient()+ " "+message);
        
    }

}
