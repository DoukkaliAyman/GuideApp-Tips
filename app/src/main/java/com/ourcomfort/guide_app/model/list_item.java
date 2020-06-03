package com.ourcomfort.guide_app.model;


public class list_item  {
    private String title;
    private int image;
    private String description;
    private String date_item;



    public list_item(String title, int image, String date_item) {
        this.title = title;
        this.image = image;
        this.date_item = date_item;
    }

    public list_item(String title, int image, String description,String date_item) {
        this.title = title;
        this.image = image;
        this.description = description;
        this.date_item = date_item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate_item() {
        return date_item;
    }

    public void setDate_item(String date_item) {
        this.date_item = date_item;
    }
}
