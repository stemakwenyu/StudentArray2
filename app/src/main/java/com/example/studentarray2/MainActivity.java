package com.example.studentarray2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_broadsheet, button_individualsheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_broadsheet = findViewById(R.id.button_broad);
        button_individualsheet=findViewById(R.id.button_individual);

        button_broadsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BroadActivity.class);
                startActivity(intent);
            }
        });
        button_individualsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),IndividualActivity.class);
                startActivity(intent);
            }
        });
    }

}
