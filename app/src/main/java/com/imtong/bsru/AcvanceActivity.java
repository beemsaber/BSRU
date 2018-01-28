package com.imtong.bsru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcvanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acvance);

        Button btnbackacvance = (Button) findViewById(R.id.btnbackacvance);
        btnbackacvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AcvanceActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
