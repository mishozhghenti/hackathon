package com.example.m1sho.hackath.models;

import java.io.Serializable;

/**
 * Created by m1sho on 11/8/2015.
 */
public class Models implements Serializable {
    private String name,description,image;


    public Models(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;

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


}
