package com.example.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn_login;
    private Button btn_exit;


    private EditText et_username;
    private EditText et_password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        btn_exit = findViewById(R.id.btn_exit);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);



        //登录
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }



                //学生界面
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("name",username);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "已登录到界面", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
