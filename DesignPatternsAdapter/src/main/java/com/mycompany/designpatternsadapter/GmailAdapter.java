package com.mycompany.designpatternsadapter;
import com.mycompany.designpatternsadapter.email.Gmail;

public class GmailAdapter extends Gmail
        implements EmailProvider {

    @Override
    public void apply(Email email) {
        init();
        render(email);
    }

}
