package com.example.stores.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.stores.R;
import com.example.stores.data.ProductsModel;

import java.util.ArrayList;

public class customerAdapter2 extends BaseAdapter {
    private ArrayList<ProductsModel> productsModels;
    private Activity activity2;

    public customerAdapter2(ArrayList<ProductsModel> productsModels,Activity activity2) {
        this.productsModels = productsModels;
        this.activity2 =activity2;
    }

    @Override
    public int getCount() {
        return productsModels.size();
    }

    @Override
    public Object getItem(int i) {
        return productsModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
      LayoutInflater inflater= activity2.getLayoutInflater();
      convertView= inflater.inflate(android.R.layout.simple_list_item_2,parent,false);

      TextView textView = convertView.findViewById(R.id.pid3);
        ImageView imageView = convertView.findViewById(R.id.pid2);
        //RadioButton radioButton = convertView.findViewById(R.id.pid4);  //Storesmodel
        textView.setText(productsModels.get(i).getVersionName());
        imageView.setImageResource(productsModels.get(i).getPicture());
        //radioButtom.setRadioButtom(productsModels.get(i).getPicture());
        return convertView;
    }
}
