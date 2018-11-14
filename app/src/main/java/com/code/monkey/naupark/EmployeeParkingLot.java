package com.code.monkey.naupark;

import java.util.ArrayList;

public class EmployeeParkingLot extends ParkingLot
{

    public EmployeeParkingLot(ArrayList<ParkingMode> modes, String name )
    {
        super( modes, name );
    }

    public EmployeeParkingLot(  ArrayList<ParkingMode> modes, String name, String address )
    {
        super( modes, name, address );
        addModes();
    }

    public EmployeeParkingLot( String name, String address )
    {
        super( new ArrayList<ParkingMode>(), name, address );
    }

    /**
     * Adds the default modes for EmployeeParkingLot
     */
    private void addModes( )
    {
        this.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
        this.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
        this.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
    }


}
