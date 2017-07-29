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

public class TwoSide extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoside);

        Button tworesultBT= (Button) findViewById(R.id.tworesultBT);
        tworesultBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecureRandom random = new SecureRandom();
                int result = random.nextInt(2);
                if (result==1)
                {
                    Intent souri=new Intent(getApplication(),Souri.class);
                    startActivity(souri);
                }
                if (result==2)
                {
                    Intent arbi=new Intent(getApplication(),arbi.class);
                    startActivity(arbi);
                }
            }
        });
    }
}
