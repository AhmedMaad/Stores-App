package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.stores.R;

public class ShoppingCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        String restaurant = getIntent().getStringExtra("restaurant");
        Log.d("trace", "restaurant name: " + restaurant);

        //TODO: read data by "restaurant" and "email"

    }
}