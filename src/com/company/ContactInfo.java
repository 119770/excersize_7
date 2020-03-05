package com.company;

public class ContactInfo {
    private String name;
    private String emailAddr;

    public ContactInfo(String name, String emailAddr) {
        this.name = name;
        this.emailAddr = emailAddr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }


    public String display() {
        return "Name: " + name + " | Email: " + emailAddr;
    }
}
