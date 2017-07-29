package com.dice.znaidi.dice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button two_sideBT=(Button) findViewById(R.id.twosideBT);
        Button six_sideBT=(Button) findViewById(R.id.sixsideBT);

        six_sideBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SixSide= new Intent(getApplication(),SixSide.class);
                startActivity(SixSide);
            }
        });

        two_sideBT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent TwoSide=new Intent(getApplication(),TwoSide.class);
                startActivity(TwoSide);
            }
        });









    }
}
