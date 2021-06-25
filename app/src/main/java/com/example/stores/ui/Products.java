package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.stores.R;
import com.example.stores.data.ProductsModel;

import java.util.ArrayList;

public class Products extends AppCompatActivity {
    private ArrayList<ProductsModel> productsModels= new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        productsModels.add(new ProductsModel(R.drawable.fish,R.string.Meat));
        productsModels.add(new ProductsModel(R.drawable.fish,R.string.Ckicken));
        productsModels.add(new ProductsModel(R.drawable.fish,R.string.Bakery));
        productsModels.add(new ProductsModel(R.drawable.fish,R.string.Dassert));
//data
       customerAdapter2 adapter2= new customerAdapter2(productsModels,Products.this);
        ListView listView = findViewById(R.id.pid5);
        listView.setAdapter(adapter2);

    }
}