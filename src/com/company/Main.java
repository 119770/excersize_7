package com.company;

public class Main {

    public static void main(String[] args) {

        ContactInfo contact1 = new ContactInfo("Gaige", "119770@swcsd.us");
        ContactInfo contact2 = new BusinessInfo("Sagar", "sagar@patel.vis", "614-537-4660");
        System.out.println(contact1.display());
        System.out.println(contact2.display());
    }
}
