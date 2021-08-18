package com.springer;

public interface TaxiTravel {

    public Integer getDistance(String from, String to);

    public Integer getTicketPrice(Integer distance, Integer travellersCount);

    public void printTicket(String from, String to, Integer distance, Integer travellersCount, Integer ticketPrice);

}
