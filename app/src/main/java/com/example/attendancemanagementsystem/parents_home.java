package com.example.attendancemanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class parents_home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_home);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nagivation_parents);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.item_parents_home:
                        Intent phome = new Intent(parents_home.this,parents_home.class);
                        startActivity(phome);
                        break;
                    case R.id.item_parents_attendance:
                        Intent pattendance = new Intent(parents_home.this,parents_attendance.class);
                        startActivity(pattendance);
                        break;
                    case R.id.item_parents_marks:
                        Intent pmarks = new Intent(parents_home.this,parents_marks.class);
                        startActivity(pmarks);
                        break;
                    case R.id.item_parents_notice:
                        Intent pnotice = new Intent(parents_home.this,parents_notice.class);
                        startActivity(pnotice);
                        break;

                }
                return true;
            }
        });
    }
}
