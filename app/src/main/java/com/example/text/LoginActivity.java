package com.example.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView tvTitle;


    private RadioButton course;
    private RadioButton tool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvTitle = findViewById(R.id.tvTitle);


        course=findViewById(R.id.course);
        tool=findViewById(R.id.tool);
        tvTitle = findViewById(R.id.tvTitle);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        tvTitle.setText("欢迎"+name+"来到您的空间");


        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ClassActivity.class);
                startActivity(intent);

            }
        });

        tool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
