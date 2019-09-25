package com.example.text;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ClassActivity extends AppCompatActivity {

    private String[]data = {"Android应用程序开发", "移动应用程序测试", "高等数学", "高职英语", "Java程序设计语言", "Android游戏开发", "心里健康", "体育"
    };

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_class);
        listView = findViewById(R.id.lv_class);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ClassActivity.this,IntroductionActivity.class);
//                intent.putExtra("name","");
                startActivity(intent);
            }
        });
    }
}

