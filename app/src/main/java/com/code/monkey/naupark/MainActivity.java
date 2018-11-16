package com.code.monkey.naupark;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String userSelection = new String("");
    Spinner zone1Spinner, zone2Spinner, zone3Spinner, zone4Spinner, zone5Spinner;
    Intent reportIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reportIntent = new Intent(MainActivity.this, Navigation.class);

        configureZone1Spin();
        configureZone2Spin();
        configureZone3Spin();
        configureZone4Spin();
        configureZone5Spin();
        configureOpenLotButton();
    }

    void configureZone1Spin()
    {
        final ArrayAdapter<CharSequence> zone1Adapter = ArrayAdapter.createFromResource(this,
                                                                            R.array.zone1_array,
                                                                            android.R.layout.simple_list_item_1);
        zone1Spinner = (Spinner) findViewById(R.id.zone1_spinner);
        zone1Spinner.setAdapter(zone1Adapter);
        zone1Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
           @Override
           public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
           {
               if(zone1Spinner.getSelectedItemPosition() != 0)
               {
                   userSelection = zone1Spinner.getSelectedItem().toString();
                   zone2Spinner.setSelection(0);
                   zone3Spinner.setSelection(0);
                   zone4Spinner.setSelection(0);
                   zone5Spinner.setSelection(0);
               }

           }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }
    void configureZone2Spin()
    {
        ArrayAdapter<CharSequence> zone2Adapter = ArrayAdapter.createFromResource(this,
                                                                                R.array.zone2_array,
                                                                                android.R.layout.simple_list_item_1);
        zone2Spinner = (Spinner) findViewById(R.id.zone2_spinner);
        zone2Spinner.setAdapter(zone2Adapter);
        zone2Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
            {
                if(zone2Spinner.getSelectedItemPosition() != 0)
                {
                    userSelection = zone2Spinner.getSelectedItem().toString();
                    zone1Spinner.setSelection(0);
                    zone3Spinner.setSelection(0);
                    zone4Spinner.setSelection(0);
                    zone5Spinner.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

    }
    void configureZone3Spin()
    {
       ArrayAdapter<CharSequence> zone3Adapter = ArrayAdapter.createFromResource(this,
                                                                                R.array.zone3_array,
                                                                                android.R.layout.simple_list_item_1);
        zone3Spinner = (Spinner) findViewById(R.id.zone3_spinner);
        zone3Spinner.setAdapter(zone3Adapter);
        zone3Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
            {
                if(zone3Spinner.getSelectedItemPosition() != 0)
                {
                    userSelection = zone3Spinner.getSelectedItem().toString();
                    zone1Spinner.setSelection(0);
                    zone2Spinner.setSelection(0);
                    zone4Spinner.setSelection(0);
                    zone5Spinner.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });

    }
    void configureZone4Spin()
    {
        ArrayAdapter<CharSequence> zone4Adapter = ArrayAdapter.createFromResource(this,
                                                                                R.array.zone4_array,
                                                                                android.R.layout.simple_list_item_1);
        zone4Spinner = (Spinner) findViewById(R.id.zone4_spinner);
        zone4Spinner.setAdapter(zone4Adapter);
        zone4Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
            {
                if(zone4Spinner.getSelectedItemPosition() != 0)
                {
                    userSelection = zone4Spinner.getSelectedItem().toString();
                    zone1Spinner.setSelection(0);
                    zone2Spinner.setSelection(0);
                    zone3Spinner.setSelection(0);
                    zone5Spinner.setSelection(0);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

    }
    void configureZone5Spin()
    {
        ArrayAdapter<CharSequence> zone5Adapter = ArrayAdapter.createFromResource(this,
                                                                                R.array.zone5_array,
                                                                                android.R.layout.simple_list_item_1);
        zone5Spinner = (Spinner) findViewById(R.id.zone5_spinner);
        zone5Spinner.setAdapter(zone5Adapter);
        zone5Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
            {
                if(zone5Spinner.getSelectedItemPosition() != 0)
                {
                    userSelection = zone5Spinner.getSelectedItem().toString();
                    zone1Spinner.setSelection(0);
                    zone2Spinner.setSelection(0);
                    zone3Spinner.setSelection(0);
                    zone4Spinner.setSelection(0);

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

    }
    void configureOpenLotButton()
    {
        Button openLotButton = findViewById(R.id.checklot_btn);
        openLotButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(userSelection.contains("P"))
                {
                    reportIntent.putExtra("chosenLot", userSelection);
                    startActivity(reportIntent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please choose a lot to check", Toast.LENGTH_LONG ).show();
                }
            }
        });
    }

}
