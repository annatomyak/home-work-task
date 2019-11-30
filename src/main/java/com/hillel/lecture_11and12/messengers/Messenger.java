package com.hillel.lecture_11and12.messengers;

import com.hillel.lecture_11and12.enums.Contacts;

public interface Messenger {

    void sendTextMessage(String message, Contacts contacts);
    void sendPicture(Contacts contacts);
    void sendSmile(String smile,Contacts contacts);
    void searchContact(Contacts contacts);
    void aboutMessenger();
}
