package com.dice.znaidi.dice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by Asus on 29/07/2017.
 */

public class SixSideResult extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixsideresult);
        SecureRandom random = new SecureRandom();
        int result1 = random.nextInt(6)+1 ;
        TextView txtresult = (TextView) findViewById(R.id.txt);
        txtresult.setText(""+result1);

}}
