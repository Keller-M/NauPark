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

public class Navigation extends AppCompatActivity
{
    String myLot;


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
                    setAvailability();
                    Toast.makeText(getBaseContext(), "Availability reported", Toast.LENGTH_LONG).show();
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
    private void setAvailability()
    {

    }

    /**
     *
     * @return the availability score of the specified lot
     */
    private int getAvailability()
    {
        return 1;
    }

}
