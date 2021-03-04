package com.myappcompany.rob.interactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurency(View view) {
        Log.i("Info", "Button pressed");
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollorsDouble = amountInPoundsDouble * 1.3;
        String amountInDollorsString = String.format("%.2f", amountInDollorsDouble);
        Log.i("Amount In Dollors", amountInDollorsString);
        Toast.makeText(this, "$" + amountInPounds + " is $" + amountInDollorsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
