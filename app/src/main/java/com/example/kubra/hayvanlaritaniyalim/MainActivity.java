package com.example.kubra.hayvanlaritaniyalim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<HayvanModel> hayvanList;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listView);
        hayvanList=new ArrayList<HayvanModel>();

        hayvanList.add(new HayvanModel(R.drawable.at,R.raw.atsesi,"at"));
        hayvanList.add(new HayvanModel(R.drawable.birds,R.raw.kussesi,"kuş"));
        hayvanList.add(new HayvanModel(R.drawable.circir,R.raw.circirbocegi,"cırcır böceği"));
        hayvanList.add(new HayvanModel(R.drawable.fil,R.raw.filsesi,"fil"));
        hayvanList.add(new HayvanModel(R.drawable.frog,R.raw.frogsesi,"kurbağa"));
        hayvanList.add(new HayvanModel(R.drawable.kaz,R.raw.kazsesi,"kaz"));
        hayvanList.add(new HayvanModel(R.drawable.kedi,R.raw.kedisesi,"kedi"));
        hayvanList.add(new HayvanModel(R.drawable.ordek,R.raw.ordeksesi,"ördek"));
        hayvanList.add(new HayvanModel(R.drawable.sheep,R.raw.koyunsesi,"koyun"));

        CustomAdapter adapter=new CustomAdapter(this,hayvanList);
        listView.setAdapter(adapter);


    }
}
