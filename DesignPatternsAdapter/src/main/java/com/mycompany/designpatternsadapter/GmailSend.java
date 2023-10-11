package com.mycompany.designpatternsadapter;
import com.mycompany.designpatternsadapter.email.Gmail;

public class GmailSend implements EmailProvider {
    
    private Gmail gmail;
    
    public GmailSend(Gmail gmail) {
        this.gmail = gmail;
    }
    
    @Override
    public void apply(Email image) {
        gmail.init();
        gmail.render(image);
    }
}
