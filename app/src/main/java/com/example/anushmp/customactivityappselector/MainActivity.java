package com.example.anushmp.customactivityappselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etIntent;
    private Button intentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviews();

        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendInfoToApp2 = new Intent("com.fetchusername");
                //sendInfoToApp2.setAction("fetchusername");
                sendInfoToApp2.putExtra("key", etIntent.getText());
                startActivity(sendInfoToApp2);

            }
        });


    }

    private void initviews(){

        etIntent = findViewById(R.id.etUsername);
        intentButton = findViewById(R.id.intentbutton);

    }




}