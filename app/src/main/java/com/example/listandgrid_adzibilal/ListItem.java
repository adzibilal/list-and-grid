package com.example.listandgrid_adzibilal;

public class ListItem {
    private String title;
    private String subtitle;
    private String imageUrl;

    public ListItem(String title, String subtitle, String imageUrl) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
