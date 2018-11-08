package com.code.monkey.naupark;

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
            returnLot = null;
        }
        else if( type.equals( "P54" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P50" ))
        {
            returnLot = null;
        }
        else if( type.equals( "P53" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P51" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P62A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P62B" ) )
        {
            returnLot = null;
        }
         else if( type.equals( "P47" ) )
        {
            returnLot = null;
        }
         else if( type.equals( "P51" ) )
        {
            returnLot = null;
        }




        return returnLot;
    }
}
