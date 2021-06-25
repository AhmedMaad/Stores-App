package com.example.stores.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        storesmodels.add(new Storesmodel(R.drawable.bakery, R.string.Bakery, ""
                , 0.0));
        storesmodels.add(new Storesmodel(R.drawable.dessert, R.string.Dassert, ""
                , 0.0));
        storesmodels.add(new Storesmodel(R.drawable.milky, R.string.milky, ""
                , 0.0));
        storesmodels.add(new Storesmodel(R.drawable.legumes, R.string.legumes, ""
                , 0.0));
        storesmodels.add(new Storesmodel(R.drawable.alternative, R.string.alternative, ""
                , 0.0));

        CustomerAdapter adapter = new CustomerAdapter(storesmodels, Restaurants.this);

        ListView listView = findViewById(R.id.so1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Restaurants.this
                        , MealDetailsActivity.class);
                intent.putExtra("meal", storesmodels.get(position));
                startActivity(intent);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shopping_cart_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent i = new Intent(this, ShoppingCart.class);

        switch (item.getItemId()) {
            case R.id.item_chef_hamdy:
                i.putExtra("cart", "chef_hamdy");
                startActivity(i);
                return true;

            case R.id.item_gygy:
                i.putExtra("cart", "gigi");
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}







