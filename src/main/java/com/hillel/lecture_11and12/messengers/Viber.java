package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public class Viber implements Messenger {
    String nameViberMessenger= "Viber";
    String versionViberMessenger= "5.5.145";

    @Override
    public void sendTextMessage(String message, Contacts contacts) {
        System.out.println("Your message: '"+message+"' sent to"+contacts.getName()+" in "+nameViberMessenger);
    }

    @Override
    public void sendPicture(Contacts contacts) {
        System.out.println("Your picture sent to " +contacts.getName() +" in "+nameViberMessenger);
    }

    @Override
    public void sendSmile(String smile,Contacts contacts) {
        System.out.println("Your smile '"+smile+"' sent to "+contacts.getName()+" in "+nameViberMessenger);
    }

    @Override
    public void searchContact(Contacts contacts) {
        System.out.println(contacts.getNumber()+" "+contacts.getName()+" "+contacts.getGroup());
    }

    @Override
    public void aboutMessenger() {
        System.out.println(nameViberMessenger +"Viber is a free to download app that allows users to make free calls, send texts, pictures and video messages to other Viber users.");
    }

    public void scanerQRcode(){
        System.out.println("Your code is scanned");
    }
    public void createChat(Contacts userOne,Contacts userTwo){
        System.out.println("You created chat with "+userOne.getName()+" and "+userTwo.getName());
    }
}
