package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.stores.R;
import com.example.stores.data.Storesmodel;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {
    private ArrayList<Storesmodel> storesmodels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        storesmodels.add(new Storesmodel(R.drawable.bakery, R.string.Bakery));
        storesmodels.add(new Storesmodel(R.drawable.dessert, R.string.Dassert));
        storesmodels.add(new Storesmodel(R.drawable.meat, R.string.Meat));
        storesmodels.add(new Storesmodel(R.drawable.ckicken, R.string.Ckicken));
        storesmodels.add(new Storesmodel(R.drawable.fish, R.string.Fish));

        CustomerAdapter adapter = new CustomerAdapter(storesmodels, Restaurants.this);

        ListView listView = findViewById(R.id.so1);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent =new Intent(this,Products.class);
                intent.putExtra("choclet", )
            }

        });
        }
    }







