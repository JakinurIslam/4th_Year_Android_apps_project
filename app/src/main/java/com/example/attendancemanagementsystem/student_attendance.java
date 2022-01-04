package com.example.attendancemanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class student_attendance extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendance);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nagivation_student);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.item_student_home:
                        Intent shome = new Intent(student_attendance.this,student_home.class);
                        startActivity(shome);
                        break;
                    case R.id.item_student_attendance:
                        Intent sattendance = new Intent(student_attendance.this,student_attendance.class);
                        startActivity(sattendance);
                        break;
                    case R.id.item_student_course:
                        Intent scourse = new Intent(student_attendance.this,student_course.class);
                        startActivity(scourse);
                        break;
                    case R.id.item_student_view:
                        Intent sview = new Intent(student_attendance.this,student_view.class);
                        startActivity(sview);
                        break;
                    case R.id.item_student_about:
                        Intent sabout = new Intent(student_attendance.this,student_about.class);
                        startActivity(sabout);
                        break;

                }
                return true;
            }
        });
    }
}
