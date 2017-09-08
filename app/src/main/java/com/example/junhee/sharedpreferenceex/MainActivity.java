package com.example.junhee.sharedpreferenceex;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        SharedPreferences pref = getSharedPreferences("pref", MainActivity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name", "Junhee, Lee");
        editor.putString("age", "20");
        editor.commit();

        String name = pref.getString("name", "");
        String age = pref.getString("age", "");

        tv.setText("name : " + name + "\n" + "age : " + age);
    }
}
