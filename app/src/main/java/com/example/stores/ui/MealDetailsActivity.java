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
                meals.add(new MealDetailsModel(R.drawable.d1, "Gollash", "Butter - Flour - Cream Cheese - Yeast - Sugar", 12.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d2, "Donuts", "Butter - Flour - Cream Cheese - Yeast - Sugar", 14.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d3, "Gatooh", "Butter - Flour - Cream Cheese - Yeast - Sugar", 16.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d4, "Cupcake", "Butter - Flour - Cream Cheese - Yeast - Sugar", 24.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d5, "Mhlbya", "Butter - Flour - Cream Cheese - Yeast - Sugar", 12.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.d6, "Semolena", "Butter - Flour - Cream Cheese - Yeast - Sugar", 5.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d7, "Kaster", "Butter - Flour - Cream Cheese - Yeast - Sugar", 7.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d8, "Kakao Cream", "Butter - Flour - Cream Cheese - Yeast - Sugar", 64.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.d10, "Basboosa", "Butter - Flour - Cream Cheese - Yeast - Sugar", 5.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d11, "Biscuits", "Butter - Flour - Cream Cheese - Yeast - Sugar", 4.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d12, "Gollash Mlfoof", "Butter - Flour - Cream Cheese - Yeast - Sugar", 55.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d13, "Torta", "Butter - Flour - Cream Cheese - Yeast - Sugar", 42.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d14, "Cake", "Butter - Flour - Cream Cheese - Yeast - Sugar", 5.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.d15, "Betefoor", "Butter - Flour - Cream Cheese - Yeast - Sugar", 6.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.d16, "Creamy Cupcake", "Butter - Flour - Cream Cheese - Yeast - Sugar", 1.00, "Gigi"));
                break;

            case "milky":
                meals.add(new MealDetailsModel(R.drawable.m1, "Gigilac Baby Food", "Puree - Apple - Sweet Potato - Avocado", 0.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.m2, "Gigi Latee", "Coffee - Espresso - Milk", 0.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.m3, "Milk Products", "Milk - Milk Again", 0.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.m4, "Gigiquick", "Milk - Caffeiene", 0.00, "Gigi"));

                break;

            case "legumes":
                meals.add(new MealDetailsModel(R.drawable.l1, "Gigi Soaps", "Soap - Water - Chicken", 10.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l2, "Healthy Pasta", "Pasta - Noodles", 20.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l3, "Gigi Mix", "Mix - Noodles - PAsta - Mix", 30.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l4, "Borgol", "Borgol - Salt - Sugar", 35.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l5, "Koskosy", "Koskosy - Sugar - Milk", 21.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l6, "Rice Substitute", "Rice - Half Breed Rice", 12.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.l7, "Rica Pasta", "Rice - Pasta", 41.00, "Hamdy"));
                break;

            case "alternative":
                meals.add(new MealDetailsModel(R.drawable.a1, "Fool", "Fool - Water", 12.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.a2, "Pita Bread", "Bread - Pita Bread", 41.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a3, "Giga Puree", "Butter - Flour - Cream Cheese - Yeast - Sugar", 13.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a4, "Baneeh", "Chicken - Vegetar - Hot sauce", 54.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.a5, "Fteer Agwa", "Agwa - Butter - Water - Salt", 12.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a6, "Gigi Pasta", "Butter - Flour - Cream Cheese - Yeast - Sugar", 10.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a7, "Omlet Substitute", "Eggs - Omlet", 6.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a8, "Gigi Mix", "Butter - Flour - Cream Cheese - Yeast - Sugar", 8.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a9, "Gigi Salad", "Tomato - Cucumber", 7.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a10, "Gigi Omelette", "Omelette - Eggs", 12.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a11, "Burger", "Feno - Burger - Lettuse", 16.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a12, "3 Rice Substitute", "Rice - Water", 18.00, "Gigi"));
                meals.add(new MealDetailsModel(R.drawable.a13, "Nagets", "Chicken - Secret Ingredients", 20.00, "Hamdy"));
                meals.add(new MealDetailsModel(R.drawable.a14, "Gigi Puree", "Puree - Gigi", 31.00, "Gigi"));
                break;

        }

    }
}