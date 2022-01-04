package com.example.attendancemanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner SpinnerType;
    String[] alltype;
    TextView create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create_account=(TextView) findViewById(R.id.login_create_account);
        SpinnerType = (Spinner) findViewById(R.id.spinner);
        alltype = getResources().getStringArray(R.array.Type);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,alltype);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerType.setAdapter(adapter);
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_account = new Intent(MainActivity.this,registation.class);
                startActivity(c_account);
            }
        });
    }
}
