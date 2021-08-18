package com.springer;

import java.util.HashMap;
import java.util.Map;

public abstract class TaxiTravel {

    public static final Map<String, Integer> distances = new HashMap<>();

    public void addRoute(String route, Integer distance) {
        if (!distances.containsKey(route)) {
            distances.put(route, distance);
        }
    }

    public abstract Integer getDistance(String from, String to);

    public abstract Integer getTicketPrice(Integer distance, Integer travellersCount);

    public abstract void printTicket(String from, String to, Integer distance, Integer travellersCount, Integer ticketPrice);

}
