package com.example.konovodov_hw_421_customlist;

import android.graphics.drawable.Drawable;

public class ItemData {

    private Drawable image;
    private String title;
    private String subtitleCategory;

    private String subtitle;
    private boolean checked;

    public ItemData(Drawable image, String title, String subtitleCategory, String subtitle, boolean checked) {
        this.image = image;
        this.title = title;
        this.subtitleCategory    = subtitleCategory;
        this.subtitle = subtitle;
        this.checked = checked;
    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getSubtitleCategory() {
        return subtitleCategory;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
