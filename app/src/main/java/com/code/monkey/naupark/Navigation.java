package com.code.monkey.naupark;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;


public class Navigation extends AppCompatActivity
{
    String myLot,myAvail;
    ParkingAvailability avail = new ParkingAvailability();
    ParkingLot lot = new ParkingLot();

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_layout);

        if(PackageManager.PERMISSION_GRANTED==checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION))
        {
            LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            @SuppressLint("MissingPermission")
            Location location  = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

            double longitude   = location.getLongitude();
            double latitude    = location.getLatitude();
        }

        Intent inputIntent     = getIntent();
        myLot                  = new String(inputIntent.getStringExtra("chosenLot"));

        configureReportButton();
        configureFullButton();
        configureModerateButton();
        configureEmptyButton();
        getAvailabilityTime(lot);
        setLot();
    }


    private void configureReportButton()
    {
        Button reportButton = findViewById(R.id.report_button);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(checkLocation())
                {
                    lot.setName(myLot);
                    setAvailability( lot, avail); //need listener for lot level
                    //Toast.makeText(getBaseContext(), "Availability reported", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Navigation.this, MainActivity.class));
                    finish();
                }
                else
                {

                    Toast.makeText(getBaseContext(), "Get closer to report availability", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void configureFullButton()
    {

        Button reportButton = findViewById(R.id.full_button);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                avail.setAvailability(0);
            }
        });
    }

    private void configureModerateButton()
    {

        Button reportButton = findViewById(R.id.some_button);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                avail.setAvailability(1);
            }
        });
    }

    private void configureEmptyButton()
    {

        Button reportButton = findViewById(R.id.lots_button);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                avail.setAvailability(2);
            }
        });
    }


    /**
     * Adds the lot's string to the TextView lotName
     */
    private void setLot()
    {
        TextView lotName = (TextView) findViewById(R.id.lotName);
        lotName.setText("Lot: " + myLot);
    }

    /**
     *
     * @return whether the user has the correct pass for this lot
     */
    private boolean checkPass()
    {
        return true;
    }

    /**
     *
     * @return whether the user can park there at the specific time
     */
    private boolean checkTime()
    {
        return true;
    }

    /**
     * @return whether the user is close enough to be allowed to report an
     *         availability for said lot.
     */
    private boolean checkLocation()
    {
        return true;
    }

    /**
     *
     */
    private void setAvailability( ParkingLot lot, ParkingAvailability avail  )
    {
        Calendar calendar = Calendar.getInstance();
        String lotName = lot.getName();
        double timestamp = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
        String time = "" + calendar.get( Calendar.DAY_OF_WEEK ) + '.' +
                      calendar.get( Calendar.HOUR ) + '.' +
                      calendar.get( Calendar.MINUTE );
        /*
        String query =  "UPDATE availability SET timestamp = " + timestamp + ", time = " + time +
                        "WHERE lot_id EQUALS" + lotName + " AND timestamp EQUALS (SELECT MIN(timestamp) " +
                        "FROM availability WHERE lot_id EQUALS " + lotName + ") " +
                        "VALUES (" + timestamp + "," + time + ")";
        */

        String query = "INSERT INTO availability VALUES (test, 0.23, Full, theDate);";
        MySQLConnection conn = new MySQLConnection();

        ResultSet rs = conn.updateDatabase( query );
        Toast.makeText(getBaseContext(), "Connection ", Toast.LENGTH_LONG).show();

        if( rs == null )
        {
            Toast.makeText(getBaseContext(), "Connection Failed", Toast.LENGTH_LONG).show();
        }


    }

    /**
     *
     * @return the availability score of the specified lot
     */
    private void getAvailabilityTime(ParkingLot lot)
    {
        String lotName = lot.getName();

        String query = "SELECT time, status FROM availability WHERE lot_id EQUALS " + lotName + ";";
        MySQLConnection conn = new MySQLConnection();

        ResultSet rs = conn.updateDatabase( query );
        Toast.makeText(getBaseContext(), "Connection ", Toast.LENGTH_LONG).show();

        if( rs == null )
        {
            Toast.makeText(getBaseContext(), "Connection Failed", Toast.LENGTH_LONG).show();
        }

        String resultString = "";
        int resultInt = 0;
        try
        {
            resultString = rs.getString(1);
            resultInt = rs.getInt(2);

        }
        catch(Exception e)
        {

        }

        ParkingAvailability avail = new ParkingAvailability();
        avail.setAvailability(resultInt);

        TextView availThing = (TextView) findViewById(R.id.textView4);
        availThing.setText("" + avail.getString() + ":" + resultString);

    }



    public boolean attemptPark(ParkingLot lot, User user, int day, int hours, int minutes)
    {
        String lotName = lot.getName();

        String parkingPass = user.getParkingPass();

        String query = "SELECT business_hours, after_hours, weekend_hours " +
                       "FROM lot WHERE " + lotName + "EQUALS lot_id AND " +
                        parkingPass + "EQUALS pass_id";


        ResultSet rs = null;
        MySQLConnection conn = new MySQLConnection();

        rs = conn.updateDatabase( query );

        try {
            boolean businessHours = rs.getBoolean( 1 );
            boolean afterHours    = rs.getBoolean(2);
            boolean weekendHours  = rs.getBoolean( 3 );

            if ( ( day == Calendar.SUNDAY ||
                    day == Calendar.SATURDAY ) &&
                    weekendHours )
            {
                return true;
            }

            if( afterHours && hours >= 16 && minutes >= 30 )
            {
               return true;
            }

            if( businessHours && !(( hours <= 7 && minutes <= 30) ||
                      (hours >= 16  && minutes >= 30)))
            {
                return true;
            }

        }
        catch( Exception e )
        {

        }
        return false;
    }


    /**
     * Attempts to park in lot, calculates the current day of the week
     * and time of day.
     * @param lot Lot to attempt to park in.
     * @return boolean true/false if user can park now
     */
    public boolean attemptParkNow( ParkingLot lot, User user )
    {
        int hours   = 0;
        int minutes = 0;
        int day     = 0;

        Calendar calendar = Calendar.getInstance();

        hours   = calendar.get( Calendar.HOUR );
        minutes = calendar.get( Calendar.MINUTE );
        day     = calendar.get( Calendar.DAY_OF_WEEK );

        return attemptPark( lot, user, day, hours, minutes );
    }
}
