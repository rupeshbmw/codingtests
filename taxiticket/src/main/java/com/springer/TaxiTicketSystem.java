package com.springer;

public class TaxiTicketSystem {

    public static void main(String args[]) {
        System.out.println("Hello Taxi Ticket System");

        System.out.println("Taxi Ticket\n-----------");

        String from = Constants.GOA;
        String to = Constants.MUMBAI;
        int travellersCount = 2;

        System.out.println("Source: " + from);
        System.out.println("Destination: " + to);

        TaxiTravel newTaxiTravel = new TaxiTravel();
        Integer distance = newTaxiTravel.getDistance(from, to);

        System.out.println("Kms: " + distance);
        System.out.println("No. of travellers = " + travellersCount);

        System.out.println("Total = " + newTaxiTravel.getTicketPrice(distance, travellersCount) + " INR");
    }
}
