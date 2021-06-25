package com.example.stores.data;

public class MealDetailsModel {

    private int picture;
    private String name;
    private String ingredients;
    private double price;
    private String restaurant;

    public MealDetailsModel(int picture, String name, String ingredients
            , double price, String restaurant) {
        this.picture = picture;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.restaurant = restaurant;
    }

    public int getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public String getRestaurant() {
        return restaurant;
    }
}
