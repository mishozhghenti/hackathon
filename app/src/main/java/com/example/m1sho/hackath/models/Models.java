package com.example.m1sho.hackath.models;

/**
 * Created by m1sho on 11/8/2015.
 */
public class Models {
    private String name,description,image;
    private int rating;

    public Models(String name, String description, String image, int rating) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
