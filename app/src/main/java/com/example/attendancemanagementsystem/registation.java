package com.example.attendancemanagementsystem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class registation extends AppCompatActivity {
    TextView txt_inst_id_pic;
    Button file_select;
    Intent choose_id_pic;
    TextView already_hav_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

        txt_inst_id_pic=(TextView)findViewById(R.id.reg_inst_id_pic);
        file_select=(Button)findViewById(R.id.pic_select);
        already_hav_account=(TextView)findViewById(R.id.reg_already_account);
        already_hav_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent a_h_account= new Intent(registation.this,teacher_home.class);
            startActivity(a_h_account);
            }
        });
        file_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                choose_id_pic=new Intent(Intent.ACTION_GET_CONTENT);
                choose_id_pic.setType("*/*");
                startActivityForResult(choose_id_pic,10);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        switch (requestCode) {

            case 10:

                if(resultCode==RESULT_OK) {

                    String path = data.getData().getPath();
                    txt_inst_id_pic.setText(path);
                }

                break;
        }
    }
}
