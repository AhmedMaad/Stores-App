package com.example.stores.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.stores.R;
import com.example.stores.data.MealDetailsModel;

import java.util.ArrayList;

public class MealDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        String mealType = getIntent().getStringExtra("meal");

        ArrayList<MealDetailsModel> meals = new ArrayList<>();

        switch (mealType) {

            case "bakery":
                meals.add(new MealDetailsModel(R.drawable.b1, "Bakery Soup", "soup - Bakery - egg - milk", 10.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b2, "Croissant", "Butter - Egg - Milk - Yeast - Sugar - Plain Flour - Unsalted Butter", 15.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b3, "White Bread", "Bread - Butter - Yeast - Sugar - Plain Flour - String white bread flour", 9.99, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.b4, "Bateeh", "Honey - Yeast - Sugar - Little Salt", 15.50, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b5, "Mushroom Pizza", "Mushroom - Cheese - Tomato - Mozzarella - Flour - Pizza Dough", 3.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b6, "Sun Bread", "Milk - Eggs - Sugar - Dry Yeast - Salted Butter", 4.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b7, "Circle Sandwich", "Cheese - Bread - Bacon - Toast - Turkey - Tomato", 35.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b9, "Mini Pizza", "Cheese - Tomato - Mozzarella - Flour - Pizza Dough", 25.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.b10, "Mini Feno", "Cheese - Bread - Bacon - Toast - Turkey - Tomato", 65.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b11, "Bread", "Cheese - Bread - Bacon - Toast - Turkey - Tomato", 64.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.b12, "Regular Feno", "Cheese - Bread - Bacon - Toast - Turkey - Tomato", 25.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.b13, "Sinnabon", "Butter - Flour - Cream Cheese - Yeast - Sugar", 17.00, "Gigi"));
                break;

            case "dessert":
                meals.add(new MealDetailsModel());
                break;

            case "milky":
                meals.add(new MealDetailsModel());
                break;

            case "legumes":
                meals.add(new MealDetailsModel());
                break;

            case "alternative":
                meals.add(new MealDetailsModel());
                break;

        }

    }
}