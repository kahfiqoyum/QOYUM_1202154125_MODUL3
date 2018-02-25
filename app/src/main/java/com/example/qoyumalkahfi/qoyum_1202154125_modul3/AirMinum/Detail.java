package com.example.qoyumalkahfi.qoyum_1202154125_modul3.AirMinum;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.qoyumalkahfi.qoyum_1202154125_modul3.R;

public class Detail extends AppCompatActivity {

    TextView tv_menu, tv_deskripsi, tv_liter;
    ImageView iv_foto, iv_battery;
    int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_menu = (TextView) findViewById(R.id.tv_detailFood);
        tv_deskripsi = (TextView) findViewById(R.id.tv_detailPrice);
        tv_liter = (TextView) findViewById(R.id.liter);
        iv_foto = (ImageView) findViewById(R.id.iv_detailPhoto);
        iv_battery = (ImageView) findViewById(R.id.battery);

        Intent i = this.getIntent();
        String menu = i.getExtras().getString("nama");
        String deskripsi = i.getExtras().getString("deskripsi");
        int gambar = i.getExtras().getInt("gambar");


        tv_menu.setText(menu);
        tv_deskripsi.setText(deskripsi);
        iv_foto.setImageResource(gambar);
    }

    public void tambah(View view) {

        angka++;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (angka == 0) {
                    iv_battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    tv_liter.setText("20 L");
                    Toast.makeText(getApplicationContext(), "Air Sedikit", Toast.LENGTH_LONG).show();

                } else if (angka == 1) {
                    iv_battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    tv_liter.setText("30 L");

                } else if (angka == 2) {
                    iv_battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    tv_liter.setText("60 L");

                } else if (angka == 3) {
                    iv_battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    tv_liter.setText("80 L");

                } else if (angka == 4) {
                    iv_battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    tv_liter.setText("90 L");

                } else if (angka == 5){
                    iv_battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    tv_liter.setText("FULL");
                    Toast.makeText(getApplicationContext(), "Air Sudah Full", Toast.LENGTH_LONG).show();

                }
            }
        }, 200);

    }

    public void kurang(View view) {

        angka--;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (angka == 0) {
                    iv_battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    tv_liter.setText("20 L");
                    Toast.makeText(getApplicationContext(), "Air Sedikit", Toast.LENGTH_LONG).show();

                } else if (angka == 1) {
                    iv_battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    tv_liter.setText("30 L");

                } else if (angka == 2) {
                    iv_battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    tv_liter.setText("60 L");

                } else if (angka == 3) {
                    iv_battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
                    tv_liter.setText("80 L");

                } else if (angka == 4) {
                    iv_battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    tv_liter.setText("90 L");

                } else if (angka == 5){
                    iv_battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    tv_liter.setText("FULL");
                    Toast.makeText(getApplicationContext(), "Air Sudah Full", Toast.LENGTH_LONG).show();

                }
            }
        }, 200);

    }
}
