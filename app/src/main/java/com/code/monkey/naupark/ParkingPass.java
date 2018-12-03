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


}
