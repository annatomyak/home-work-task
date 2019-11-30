package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public class User {
    public static void main(String[] args) {
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
        viber.createChat(Contacts.IRINA,Contacts.SERGEY);


    }
}
