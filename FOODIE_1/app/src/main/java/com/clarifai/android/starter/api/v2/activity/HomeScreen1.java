package com.clarifai.android.starter.api.v2.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.clarifai.android.starter.api.v2.R;



public class HomeScreen1 extends AppCompatActivity {

    private Button startButton;
    private String startButtonText;
    private Button infoButton;
    boolean isClicked = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setUpComponents();
        //PopUpWindow.onCreate();
    }

    private void setUpComponents() {
        startButton = (Button) findViewById(R.id.start_button);
        startButtonText = (String) startButton.getText();
        infoButton = (Button) findViewById(R.id.info_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeScreen1.this, RecognizeConceptsActivity.class);
                startActivity(i);
            }
        });
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeScreen1.this, InfoPopUp.class);
                startActivity(i);
            }

        });

    }
}
