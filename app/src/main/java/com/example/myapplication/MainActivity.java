package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnClickHere);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBirthdayScreen();
            }
        });
    }
    public void openBirthdayScreen(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}