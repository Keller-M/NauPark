package com.code.monkey.naupark;

import java.util.ArrayList;

public class ParkingLotFactory
{

    /**
     * Creates a new parking lot object, depending upon type.
     * Type is a string parameter being one of:
     * P52, P54, P50, P53, P51, P62A, P62B, P47, P51,
     * P46, P45, P44, P63, P66A, P66, P41, P68, P42,
     * P60, P96G, P32B, P32A, P32, P32C, P33, P38,
     * P96G, P31, P29, P96A, P96B, P16A, P13, P16,
     * P11, P12, P6, P7A, P96C, P28D, P13A, P9, P10,
     * P11, P12, P6, P5, P3, P3B, P3A, P2, P1B, P1A
     * @param type The string type of parking lot to create
     * @return A new parkingLot instance, as specified by
     *         type
     */
    ParkingLot createParkingLot( String type )
    {
        ParkingLot returnLot = null;

        if( type.equals( "P52") )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P54" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P50" ))
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P53" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P51" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P62" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P62A" ) )
        {
            returnLot = new PaidParkingLot( type, null );
        }
        else if( type.equals( "P62B" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
         else if( type.equals( "P47" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P46" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P45" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P45A" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P45B" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P64" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P44" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
         else if( type.equals( "P63" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
         else if( type.equals( "P66A" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P66" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P41" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P40" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P68" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P42" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P60" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P61" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P96G" ) ) {
            returnLot = new ResidentParkingLot(type, null);
        }
        else if( type.equals( "P32B" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P32A" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P32" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P32C" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P33" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P33A" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P39" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P38" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P19" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P96G" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P31" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P29" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P96A" ) )
        {
            returnLot = new PaidParkingLot( type, null );
        }
        else if( type.equals( "P96B" ) )
        {
            returnLot = new PaidParkingLot( type, null );
        }
        else if( type.equals( "P16A" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P13" ) )
        {
            returnLot = new PaidParkingLot( type, null );
        }
        else if( type.equals( "P16" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P11" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P12" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P6" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P7A" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P96C" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P28D" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P13D ") )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P13A" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P9" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P10" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P5" ) )
        {
            returnLot = new ResidentParkingLot( type, null );
        }
        else if( type.equals( "P3" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P3B" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P3A" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P2" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P1B" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        else if( type.equals( "P1A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P8" ) )
        {
            returnLot = new EmployeeParkingLot( type, null );
        }
        return returnLot;
    }
}
