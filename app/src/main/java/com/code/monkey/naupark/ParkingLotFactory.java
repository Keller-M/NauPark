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
            returnLot = new P47ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P47"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );

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
        else if( type.equals( "P46" ) )
        {
            returnLot = new P46ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P46"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P45" ) )
        {
            returnLot = new P45ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P45"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P45A" ) )
        {
             returnLot = new P45AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P45A"
             );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P45B" ) )
        {
            returnLot = new P45BParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P45B"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P64" ) )
        {
             returnLot = new P64ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                     "P64"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P44" ) )
        {
            returnLot = null;
        }
         else if( type.equals( "P63" ) )
        {
            returnLot = null;
        }
         else if( type.equals( "P66A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P66" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P41" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P68" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P42" ) )
        {
            returnLot = new P42ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P42"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P60" ) )
        {
            returnLot = new P60ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P60"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P61" ) )
        {
            returnLot = new P61ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P61"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P96G" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P32B" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P32A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P32" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P32C" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P33" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P39" ) )
        {
            returnLot = new P39ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P39"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P38" ) )
        {
            returnLot = new P38ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P38"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P19" ) )
        {
            returnLot = new P19ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P19"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P96G" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P31" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P29" ) )
        {
            returnLot = new P29ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P29"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P96A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P96B" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P16A" ) )
        {
            returnLot = new P16AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P16A"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P13" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P16" ) )
        {
            returnLot = new P16AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P16A"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P11" ) )
        {
            returnLot = new P16AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P11"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P12" ) )
        {
            returnLot = new P16AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P12"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P6" ) )
        {
            returnLot = new P6ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P6"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P7A" ) )
        {
            returnLot = new P16AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P7A"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P96C" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P28D" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P13D ") )
        {
             returnLot = new P13DParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P13D"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P13A" ) )
        {
            returnLot = new P13AParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P13A"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P9" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P10" ) )
        {
            returnLot = null;
            returnLot = new P10ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P10"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P5" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P3" ) )
        {
            returnLot = new P3ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P3"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P3B" ) )
        {
            returnLot = new P3BParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P3B"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        else if( type.equals( "P3A" ) )
        {
            returnLot = null;
        } 
        else if( type.equals( "P2" ) )
        {
            returnLot = new P2ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P2"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        } 
        else if( type.equals( "P1B" ) )
        {
            returnLot = new P1BParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P1B"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        } 
        else if( type.equals( "P1A" ) )
        {
            returnLot = null;
        }
        else if( type.equals( "P8" ) )
        {
            returnLot = new P8ParkingLot( new ArrayList<ParkingLot.ParkingMode>(),
                    "P8"
            );
            returnLot.addMode( ParkingLot.ParkingMode.EMPLOYEE_ONLY );
            returnLot.addMode( ParkingLot.ParkingMode.AFTERNOON_ON_WEEKDAYS );
            returnLot.addMode( ParkingLot.ParkingMode.ONLY_ON_WEEKDAYS );
        }
        return returnLot;
    }
}
