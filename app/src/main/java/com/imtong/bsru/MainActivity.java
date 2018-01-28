package com.imtong.bsru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnbasic = (Button) findViewById(R.id.btnbasic);
        Button btnacvance = (Button) findViewById(R.id.btnacvance);

        btnbasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BasicActivity.class);
                startActivity(intent);
                startActivity(intent);
            }
        });

        btnacvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AcvanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
