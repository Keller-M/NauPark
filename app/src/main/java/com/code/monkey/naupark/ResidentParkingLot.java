package com.code.monkey.naupark;

import java.util.ArrayList;

public class ResidentParkingLot extends ParkingLot
{

    public ResidentParkingLot(ArrayList<ParkingMode> modes, String name )
    {
        super( modes, name );
    }

    public ResidentParkingLot(  ArrayList<ParkingMode> modes, String name, String address )
    {
        super( modes, name, address );
        addModes();
    }

    public ResidentParkingLot( String name, String address )
    {
        super( new ArrayList<ParkingMode>(), name, address );
    }

    /**
     * Adds the default modes for ResidentParkingLot
     */
    private void addModes( )
    {
        this.addMode( ParkingMode.RESIDENT_ONLY );
    }

}
