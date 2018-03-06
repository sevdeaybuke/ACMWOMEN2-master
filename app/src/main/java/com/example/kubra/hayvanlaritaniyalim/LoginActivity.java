package com.example.kubra.hayvanlaritaniyalim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView msg;
    String isim,soyisim;
    Button dinle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        msg= (TextView) findViewById(R.id.msg);

        isim=getIntent().getStringExtra("name");
        soyisim=getIntent().getStringExtra("surname");

        msg.setText("MERHABA "+isim+" "+soyisim);

        dinle=(Button)findViewById(R.id.btngit);
        dinle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hayvanModel=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(hayvanModel);
            }
        });

    }
}
