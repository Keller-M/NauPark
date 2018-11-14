package com.code.monkey.naupark;

import java.util.ArrayList;

public class PaidParkingLot extends ParkingLot
{
    public PaidParkingLot(ArrayList<ParkingMode> modes, String name )
    {
        super( modes, name );
    }

    public PaidParkingLot(  ArrayList<ParkingMode> modes, String name, String address )
    {
        super( modes, name, address );
        addModes();
    }

    public PaidParkingLot( String name, String address )
    {
        super( new ArrayList<ParkingMode>(), name, address );
    }

    /**
     * Adds the default modes for PaidParkingLot
     */
    private void addModes( )
    {
        this.addMode( ParkingLot.ParkingMode.PAY_TO_PARK );
    }

}
