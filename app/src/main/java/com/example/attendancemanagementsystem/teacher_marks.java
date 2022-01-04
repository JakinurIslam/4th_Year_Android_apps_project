package com.example.attendancemanagementsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class teacher_marks extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_marks);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nagivation_teacher);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.item_teacher_home:
                        Intent thome = new Intent(teacher_marks.this,teacher_home.class);
                        startActivity(thome);
                        break;
                    case R.id.item_teacher_attendance:
                        Intent tattendance = new Intent(teacher_marks.this,teacher_attendance.class);
                        startActivity(tattendance);
                        break;
                    case R.id.item_teacher_marks:
                        Intent tmarks = new Intent(teacher_marks.this,teacher_marks.class);
                        startActivity(tmarks);
                        break;
                    case R.id.item_teacher_view:
                        Intent tview = new Intent(teacher_marks.this,teacher_view.class);
                        startActivity(tview);
                        break;
                    case R.id.item_teacher_about:
                        Intent tnotice = new Intent(teacher_marks.this,teacher_notice.class);
                        startActivity(tnotice);
                        break;

                }
                return true;
            }
        });
    }
}
