package com.code.monkey.naupark;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Encapsulates what a parking pass is. Contains information about
 * what lots a pass is valid for. Parking passes do not consider special cases,
 * such as weekends or later in the evening.
 */
abstract public class ParkingPass
{
    /**
     *list of lots a parking pass can park in,
     * note that some lots have special designations
     * that only allow certain passes to park at certain times
    **/
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
    public boolean attemptPark(ParkingLot lot, int day, int hours, int minutes)
    {
        return lots.contains( lot );
    }


    /**
     * Attempts to park in lot, calculates the current day of the week
     * and time of day.
     * @param lot Lot to attempt to park in.
     * @return boolean true/false if user can park now
     */
    public boolean attemptParkNow( ParkingLot lot )
    {
        int hours   = 0;
        int minutes = 0;
        int day     = 0;

        Calendar calendar = Calendar.getInstance();

        hours   = calendar.get( Calendar.HOUR );
        minutes = calendar.get( Calendar.MINUTE );
        day     = calendar.get( Calendar.DAY_OF_WEEK );

        return attemptPark( lot, day, hours, minutes );
    }
}
