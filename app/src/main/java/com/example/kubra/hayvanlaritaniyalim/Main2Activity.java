package com.example.kubra.hayvanlaritaniyalim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText isimView,soyisimView;
    String isim,soyisim;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        isimView= (EditText) findViewById(R.id.editTextName);
        soyisimView= (EditText) findViewById(R.id.editTextSurname);
        loginButton= (Button) findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isim=isimView.getText().toString();
                soyisim=soyisimView.getText().toString();
                Intent loginIntent=new Intent(getApplicationContext(),LoginActivity.class);
                loginIntent.putExtra("name",isim);
                loginIntent.putExtra("surname",soyisim);
                startActivity(loginIntent);
            }
        });


    }
}
