package com.bawei.git_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //注释：演示用
        TextView tv_Name = new TextView(this, null);
        //输入框
        EditText editText = new EditText(this, null);
        Button button = new Button(this, null);
    }
}
