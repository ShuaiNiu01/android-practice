package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        Log.i("Info", "Imageview tapped");

        ImageView bartImageView = (ImageView)findViewById(R.id.bartImageView);

        ImageView homerImageView = (ImageView)findViewById(R.id.homerImageView);

        //bartImageView.animate().translationXBy(-1000).setDuration(2000);

        //bartImageView.animate().rotation(1800).alpha(0).setDuration(1000);

        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView)findViewById(R.id.bartImageView);
        bartImageView.animate().translationXBy(-1000);
        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }
}