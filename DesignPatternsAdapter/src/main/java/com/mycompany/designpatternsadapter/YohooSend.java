package com.mycompany.designpatternsadapter;

import com.mycompany.designpatternsadapter.email.Yahoo;

public class YohooSend implements EmailProvider {

    private Yahoo yahoo;
    
    public YohooSend(Yahoo yahoo) {
        this.yahoo = yahoo;
    }
    @Override
    public void apply(Email email) {
        System.out.println("Yahoo sendo utilizado");
    }

}
