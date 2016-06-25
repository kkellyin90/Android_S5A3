package com.funapp.session5assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCourse extends AppCompatActivity {
Button android, java, frontend, linux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
//ANDROID
        android = (Button)findViewById(R.id.buttonAndroid);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent and = new Intent(MainCourse.this, AndroidActivity.class);
                startActivity(and);
            }
        });
//JAVA
        java = (Button)findViewById(R.id.buttonJava);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jav = new Intent(MainCourse.this,JavaActivity.class);
                startActivity(jav);
            }
        });
//Frontend Web Development
        frontend = (Button)findViewById(R.id.buttonFront);
        frontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fron = new Intent(MainCourse.this, FrontendActivity.class);
                startActivity(fron);
            }
        });
//Linux Fundamentals
        linux = (Button)findViewById(R.id.buttonLinux);
        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linu = new Intent(MainCourse.this, LinuxActivity.class);
                startActivity(linu);
            }
        });


    }
}
