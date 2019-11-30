package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public class Telegram implements Messenger {
    String nameTelegramMessenger= "Telegram";
    String versionTelegramMessenger= "3.8.55";

    @Override
    public void sendTextMessage(String message, Contacts contacts) {
        System.out.println("Your message: '"+message+"' sent to "+contacts.getName()+"in "+nameTelegramMessenger);

    }

    @Override
    public void sendPicture(Contacts contacts) {
        System.out.println("Your picture sent to " +contacts.getName() +" in "+nameTelegramMessenger);
    }

    @Override
    public void sendSmile(String smile,Contacts contacts) {
        System.out.println("Your smile '"+smile+"' sent to "+contacts.getName()+" in "+nameTelegramMessenger);
    }

    @Override
    public void searchContact(Contacts contacts) {
        System.out.println(contacts.getNumber()+" "+contacts.getName()+" "+contacts.getGroup());
    }

    @Override
    public void aboutMessenger() {
        System.out.println(nameTelegramMessenger+ " is a cloud-based instant messaging and voice over IP service. Telegram client apps are available for Android, iOS, Windows Phone, Windows NT, macOS and Linux.");
    }
    public void createChat(Contacts userOne,Contacts userTwo){
        System.out.println("You created chat with "+userOne.getName()+" and "+userTwo.getName());
    }
}
