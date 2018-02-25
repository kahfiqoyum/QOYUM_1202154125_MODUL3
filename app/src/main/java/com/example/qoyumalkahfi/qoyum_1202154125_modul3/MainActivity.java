package com.example.qoyumalkahfi.qoyum_1202154125_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.qoyumalkahfi.qoyum_1202154125_modul3.AirMinum.Minuman;
import com.example.qoyumalkahfi.qoyum_1202154125_modul3.AirMinum.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerAdapter adapter=new RecyclerAdapter(this, Minuman.getAirMinum());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
