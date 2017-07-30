package com.dice.znaidi.dice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.security.SecureRandom;

/**
 * Created by Asus on 29/07/2017.
 */

public class SixSide extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixside);
        Button sixresultBT=(Button) findViewById(R.id.sixresultBT);
        sixresultBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sixsideresult = new Intent(getApplication(),SixSideResult.class);
                //sixsideresult.putExtra("result",result);
                startActivity(sixsideresult);
            }
        });
           }

}

