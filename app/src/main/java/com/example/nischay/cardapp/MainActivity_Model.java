package com.example.nischay.cardapp;

/**
 * Created by Nischay on 5/6/2020.
 */

public class MainActivity_Model {

    private int image;
    private String title;
    private String description;

    public MainActivity_Model(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
