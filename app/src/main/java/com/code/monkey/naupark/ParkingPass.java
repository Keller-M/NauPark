package com.code.monkey.naupark;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.*;
/**
 * Encapsulates what a parking pass is. Contains information about
 * what lots a pass is valid for. Parking passes do not consider special cases,
 * such as weekends or later in the evening.
 */
abstract public class ParkingPass
{
    // list of lots a parking pass can park in
    ArrayList<ParkingLot> lots;

    /**
     * Tests whether this object is able to park in lot, given
     * the current day and time of day.
     * @param lot The lot to attempt to park in
     * @param day The day to test the lot in
     * @param hours The hours
     * @param minutes
     * @return
     */
    public boolean attemptPark(ParkingLot lot, User user, int day, int hours, int minutes)
    {
        String lotName = lot.getName();


        String parkingPass = user.getParkingPass();

        String query = "SELECT business_hours, after_hours, weekend_hours " +
                       "FROM lot WHERE " + lotName + "EQUALS lot_id AND " +
                        parkingPass + "EQUALS pass_id";

        
        ResultSet rs = null;


        return lots.contains( lot );
    }


    /**
     * Attempts to park in lot, calculates the current day of the week
     * and time of day.
     * @param lot Lot to attempt to park in.
     * @return boolean true/false if user can park now
     */
    public boolean attemptParkNow( ParkingLot lot, User user )
    {
        int hours   = 0;
        int minutes = 0;
        int day     = 0;

        Calendar calendar = Calendar.getInstance();

        hours   = calendar.get( Calendar.HOUR );
        minutes = calendar.get( Calendar.MINUTE );
        day     = calendar.get( Calendar.DAY_OF_WEEK );

        return attemptPark( lot, user, day, hours, minutes );
    }
}
