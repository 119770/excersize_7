package com.company;

public class BusinessInfo extends ContactInfo {
    private String phoneNumber;

    public BusinessInfo(String name, String emailAddr, String phoneNumber) {
        super(name, emailAddr);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String display() {
        return "Name: " + getName() + " | Email: " + getEmailAddr() + " | Phone: " + phoneNumber;
    }
}
