package com.hillel.lecture_11and12.enums;

public enum Contacts {
    ANNA ("Anna","012354558","work"),
    SERGEY("Sergey","2128186128","home"),
    KATERINA ("Katya","128181818","friend"),
    IRINA ("Ira","555555555555","work");

    private String name;
    private String number;
    private String group;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getGroup() {
        return group;
    }

    Contacts(String name, String number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;

    }
}
