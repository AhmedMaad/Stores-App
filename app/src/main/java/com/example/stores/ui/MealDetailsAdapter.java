package com.example.stores.ui;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.stores.R;
import com.example.stores.data.MealDetailsModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MealDetailsAdapter extends BaseAdapter {

    private ArrayList<MealDetailsModel> meals;
    private Activity activity;
    private boolean isShoppingCart;

    public MealDetailsAdapter(ArrayList<MealDetailsModel> meals, Activity activity
            , boolean isShoppingCart) {
        this.meals = meals;
        this.activity = activity;
        this.isShoppingCart = isShoppingCart;
    }

    @Override
    public int getCount() {
        return meals.size();
    }

    @Override
    public Object getItem(int i) {
        return meals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(R.layout.meal_details_list_item, parent, false);

        ImageView picture = convertView.findViewById(R.id.iv);
        TextView name = convertView.findViewById(R.id.tv_name);
        TextView ingredients = convertView.findViewById(R.id.tv_ingredients);
        TextView price = convertView.findViewById(R.id.tv_price);

        if (isShoppingCart) {
            picture.setVisibility(View.GONE);
            ingredients.setVisibility(View.GONE);
            price.setGravity(Gravity.START);
            name.setGravity(Gravity.START);
        } else {
            picture.setImageResource(meals.get(i).getPicture());
            ingredients.setText(meals.get(i).getIngredients());
        }

        name.setText(meals.get(i).getName());
        price.setText("Price: $" + meals.get(i).getPrice());

        return convertView;
    }
}


