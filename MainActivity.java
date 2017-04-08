package org.androidtown.project;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBreastMilk:
                String first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonDryMilk:
                first = getTime();
                create();
                //.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonBabyFood:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonDiaper:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonsleep:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonbreastPump:
                first = getTime();
                create();
               // Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonpumpMilk:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonbath:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonvaccin:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonetc:
                first = getTime();
                create();
                //Toast.makeText(getApplicationContext(),first,Toast.LENGTH_LONG).show();
                break;
        }
    }
    public static String getTime(){
        long now = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("aa hh:mm");
        Date date = new Date(now);
        String strDate = dateFormat.format(date);
        return strDate;
    }
    public void create(){
        LinearLayout topLayout = (LinearLayout)findViewById(R.id.listLayout);
        TextView tv = new TextView(this);
        tv.setText(getTime());
        tv.setTextSize(20);
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        topLayout.addView(tv);
    }
}