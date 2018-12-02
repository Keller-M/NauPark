package com.code.monkey.naupark;

public class ParkingAvailability
{
    int availability;

    static final int AVAILABILITY_FULL    = 0;
    static final int AVAILABILITY_PARTIAL = 1;
    static final int AVAILABILITY_EMPTY   = 2;

    public ParkingAvailability()
    {
        this.availability = AVAILABILITY_EMPTY;
    }
    
    public void setAvailability( int level )
    {
        this.availability = level;
    }

    public String getString()
    {
        String returnVal = "";
        switch( availability )
        {
            case AVAILABILITY_EMPTY:
                returnVal = "Empty";
                break;
            case AVAILABILITY_PARTIAL:
                returnVal = "Partial";
                break;
            case AVAILABILITY_FULL:
                returnVal = "Full";
                break;
        }
        return returnVal;
    }
}
