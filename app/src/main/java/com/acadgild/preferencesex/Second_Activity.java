package com.acadgild.preferencesex;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by hp on 22-11-2016.
 */

public class Second_Activity extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Password = "Password";
    public static final String Frequency = "Frequency";
    public static final String IsScreenLock = "IsScreenLock";
    public boolean ScreenLock = false;
    SharedPreferences sharedPreferences;
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textView1 = (TextView) findViewById(R.id.tv_saved_password);
        textView2 = (TextView) findViewById(R.id.tv_saved_frequency);
        textView3 = (TextView) findViewById(R.id.tv_saved_checkbox);
        sharedPreferences = getApplicationContext().getSharedPreferences(MyPREFERENCES, 0);

        String passwordText= sharedPreferences.getString(Password,"NA");
        Log.e(" passwordText", passwordText);
        String frequencyText= sharedPreferences.getString(Frequency,"NA");
        Log.e("frequencyText",frequencyText);
        Boolean checkedText= sharedPreferences.getBoolean(IsScreenLock,false);
        Log.e("checkedText",checkedText.toString());
        textView1.setText(passwordText);
        textView2.setText(frequencyText);
        textView3.setText(checkedText.toString());

    }
}

