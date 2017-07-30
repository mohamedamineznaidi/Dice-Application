package com.dice.znaidi.dice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton sfbt =(ImageButton) findViewById(R.id.sfbt);
        ImageButton dicebt=(ImageButton) findViewById(R.id.dicebt) ;

        dicebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SixSide= new Intent(getApplication(),SixSide.class);
                startActivity(SixSide);
            }
        });

        sfbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent TwoSide=new Intent(getApplication(),TwoSide.class);
                startActivity(TwoSide);
            }
        });









    }
}
