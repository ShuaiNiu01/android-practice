package com.example.timestables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView timesTablesListView;
    public void generateTimesTable(int timesTableNumber){
        ArrayList<String> timeTableContent = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            timeTableContent.add(Integer.toString(i * timesTableNumber));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,timeTableContent);
        timesTablesListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timesTablesSeekBar = findViewById(R.id.timesTablesSeekBar);
        timesTablesListView = findViewById(R.id.timesTablesListView);

        timesTablesSeekBar.setMax(20);
        timesTablesSeekBar.setProgress(10);
        timesTablesSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timesTableNumber;
                if (progress < min) {
                    timesTableNumber = min;
                    timesTablesSeekBar.setProgress(min);
                } else {
                    timesTableNumber = progress;
                }

                Log.i("Seekbar Value", Integer.toString(timesTableNumber));
                generateTimesTable(timesTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}