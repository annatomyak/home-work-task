package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public class FacebookMessenger implements Messenger {
    String nameFacebookMessenger= "Facebook Messenger";
    String versionFacebookMessenger= "2.0.15";


    @Override
    public void sendTextMessage(String message, Contacts contacts) {
        System.out.println("Your message:'"+message+"' sent to "+contacts.getName()+" in "+nameFacebookMessenger);
    }

    @Override
    public void sendPicture(Contacts contacts) {
        System.out.println("Your picture sent to " +contacts.getName() +" in "+nameFacebookMessenger);
    }

    @Override
    public void sendSmile(String smile,Contacts contacts) {
        System.out.println("Your smile '"+smile+"' sent to "+contacts.getName()+" in "+nameFacebookMessenger);
    }

    @Override
    public void searchContact(Contacts contacts) {
    System.out.println(contacts.getNumber()+" "+contacts.getName()+" "+contacts.getGroup());
    }

    @Override
    public void aboutMessenger() {
        System.out.println(nameFacebookMessenger+ " is a FREE mobile messaging app used for instant messaging, sharing photos, videos, audio recordings and for group chats. ");

    }
}
