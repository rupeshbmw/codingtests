package com.springer;

import java.util.HashMap;
import java.util.Map;

public class TaxiTravel {

    public static final Map<String, Integer> distances = new HashMap<>();

    {
        distances.put(Constants.Mumbai_Pune, 120);
        distances.put(Constants.Mumbai_Goa, 350);
        distances.put(Constants.Mumbai_Nashik, 180);
        distances.put(Constants.Pune_Nashik, 200);
    }

    public Integer getDistance(String from, String to) {
        Integer distance = distances.get(from.toUpperCase() + "-" + to.toUpperCase());
        if (distance == null) {
            distance = distances.get(to.toUpperCase() + "-" + from.toUpperCase());
        }
        return distance;
    }

    public Integer getTicketPrice(Integer distance, Integer travellersCount) {
        int ticketPrice = 0;
        if (distance > 0 && travellersCount > 0) {
            if (distance > 100) {
                // Rs. 750 till 100KM, Rs 5 per KM after 100KM
                ticketPrice = (750 + ((distance - 100) * 5)) * travellersCount;
            } else {
                ticketPrice = 750 * travellersCount;
            }
        }
        return ticketPrice;
    }
}