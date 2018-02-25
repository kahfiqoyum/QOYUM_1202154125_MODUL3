package com.example.qoyumalkahfi.qoyum_1202154125_modul3.AirMinum;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.qoyumalkahfi.qoyum_1202154125_modul3.R;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    Context c;
    ArrayList<AirMinum> airMinum;


    public RecyclerAdapter(Context c, ArrayList<AirMinum> airMinum) {
        this.c = c;
        this.airMinum = airMinum;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_minuman, parent, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        final String nama = airMinum.get(position).getNama();
        final String deskripsi = airMinum.get(position).getDeskripsi();
        final int image = airMinum.get(position).getImage();

        holder.tv1.setText(nama);
        //holder.tv2.setText(deskripsi);
        holder.cardView.setBackgroundResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(nama, deskripsi, image);
                Toast.makeText(c, nama, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return airMinum.size();
    }

    private void openDetailActivity(String name, String harga, int image) {
        Intent i = new Intent(c.getApplicationContext(), Detail.class);
        i.putExtra("nama", name);
        i.putExtra("deskripsi", harga);
        i.putExtra("gambar", image);
        c.startActivity(i);
    }
}
