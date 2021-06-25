package com.example.stores.ui;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.stores.R;
import com.example.stores.data.Storesmodel;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomerAdapter extends BaseAdapter {
    private ArrayList<Storesmodel> storesmodels;
    private Activity activity;

    public CustomerAdapter(ArrayList<Storesmodel> storesmodels,Activity activity) {
        this.storesmodels = storesmodels;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return storesmodels.size();
    }

    @Override
    public Object getItem(int position) {
        return storesmodels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            Log.d("listview", "Inflation...");
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.list_itme, parent, false);
        }


        TextView textView = convertView.findViewById(R.id.dt3);
        ImageView imageView = convertView.findViewById(R.id.it3);
        textView.setText(storesmodels.get(position).getVersionName());
        imageView.setImageResource(storesmodels.get(position).getPicture());
        return convertView;
    }
}
