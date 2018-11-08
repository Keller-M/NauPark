package com.code.monkey.naupark;

import java.util.ArrayList;

/**
 * Encapsulates what a parking pass is. Contains information about
 * what lots a pass is valid for. Parking passes do not consider special cases,
 * such as weekends or later in the evening.
 */
abstract public class ParkingPass
{
    // list of lots a parking pass can park in
    ArrayList<ParkingLot> lots;
}
