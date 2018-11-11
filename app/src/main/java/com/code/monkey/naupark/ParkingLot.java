package com.code.monkey.naupark;

import java.util.ArrayList;

/**
 * Encapsulates information needed to define a ParkingLot.
 * A parking lot has information about what times it becomes freely
 * available.
 * e.g. after 4:30PM on weekdays, or at any time during the weekends.
 */
abstract public class ParkingLot
{
    static enum ParkingMode
    {
        NO_PERMIT_REQUIRED,
        RESIDENT_ONLY,
        EMPLOYEE_ONLY,
		AFTERNOON_ON_WEEKDAYS,
        ONLY_ON_WEEKDAYS, // some lots are open Saturday and Sunday
        NOT_ON_WEEKEND, // not all lots are open Saturday and Sunday
        ALWAYS, // lot does not require a permit
        PAY_TO_PARK
    }

    // Employee, north commuter, etc...
    String name;
    ArrayList<ParkingMode> mode;

    /**
     * Initialize a ParkingLot with Mode(s), and a name
     **/
    public ParkingLot( ArrayList<ParkingMode> mode, String name )
    {
        this.mode = mode;
        this.name = name;
    }

    /**
     * Add a new parking mode to a parking lot
     * @param newMode new mode to add to the lot
     *                if the lot already contains this mdoe,
     *                it will not be added again
     */
    public void addMode( ParkingMode newMode )
    {
        if( !mode.contains( newMode ) )
        {
            mode.add( newMode );
        }
    }
}
