package com.springer;

public class TaxiTicketSystem {

    public static void main(String args[]) {

        String from = Constants.GOA;
        String to = Constants.MUMBAI;
        int travellersCount = 2;

        TaxiTravelImpl newTaxiTravelImpl = new TaxiTravelImpl();
        Integer distance = newTaxiTravelImpl.getDistance(from, to);

        newTaxiTravelImpl.printTicket(from, to, distance, travellersCount, newTaxiTravelImpl.getTicketPrice(distance, travellersCount));
    }
}
