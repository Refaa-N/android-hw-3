package com.example.arrayadapterhw3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class museumAdapter extends ArrayAdapter<museum>{
    List<museum> museumListAdapter;
    public museumAdapter(@NonNull Context context, int resource, @NonNull List<museum> objects) {
        super(context, resource, objects);
        museumListAdapter = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent ,false);

        museum currentMuseum = museumListAdapter.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView1 = view.findViewById(R.id.textView1);


        imageView.setImageResource(currentMuseum.getMuseumImage());
        textView1.setText(currentMuseum.getMuseumName()+"//");
        return view;

    }
}


