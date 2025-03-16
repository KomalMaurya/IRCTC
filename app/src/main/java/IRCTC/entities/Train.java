package IRCTC.entities;

import ticketBooking.entities;
import java.util.*;

public class Train{

    private String trainId;
    private String trainNo;

    private List<List<Boolean>> seats;
    private Map<String,Time> stationTimes;
    private List<String> stations;

}