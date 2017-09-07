package com.juacalla.juacallaquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callSecond (View view){
        Intent intent= new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void callThird (View view){
        Intent intent2= new Intent(this, ThirdActivity.class);
        startActivity(intent2);

    }
    public void callFourth (View view){
        Intent intent3= new Intent(this, FourthActivity.class);
        startActivity(intent3);

    }
}
