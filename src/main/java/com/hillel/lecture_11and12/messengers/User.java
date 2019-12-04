package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public class User {
    public static void main(String[] args) {
        String nullMessage=null;
        FacebookMessenger facebookMessenger =new FacebookMessenger();
        facebookMessenger.sendTextMessage("Hello", Contacts.IRINA);
        facebookMessenger.aboutMessenger();
        System.out.println(facebookMessenger.versionFacebookMessenger);
        facebookMessenger.searchContact(Contacts.SERGEY);
        facebookMessenger.sendPicture(Contacts.ANNA);


        Viber viber=new Viber();
        System.out.println(viber.nameViberMessenger);
        System.out.println(viber.versionViberMessenger);
        viber.aboutMessenger();
        viber.searchContact(Contacts.KATERINA);
        viber.sendPicture(Contacts.ANNA);
        viber.sendTextMessage("Hey",Contacts.SERGEY);
        viber.sendSmile("=)",Contacts.IRINA);
        viber.scanerQRcode();
        viber.createChat(Contacts.IRINA,Contacts.SERGEY);

        Telegram telegram=new Telegram();
        System.out.println(telegram.nameTelegramMessenger);
        System.out.println(telegram.versionTelegramMessenger);
        telegram.aboutMessenger();
        telegram.searchContact(Contacts.KATERINA);
        telegram.sendPicture(Contacts.KATERINA);
        telegram.sendTextMessage("how are you",Contacts.ANNA);
        telegram.sendSmile("=(",Contacts.IRINA);
        telegram.getId("1e4245465");
        telegram.getId("4185128528");
        telegram.sentUrl("https://www.google.com/");
        telegram.sentUrl("gfht");
        telegram.enterLoginAndPassword("admin","admin");
        telegram.enterLoginAndPassword("admin","123vjgj");
        viber.createChat(Contacts.IRINA,Contacts.SERGEY);


    }
}
