package com.example.android.mytube;

public class Model {
    private int imageView;
    private String textview;
    private String videoview;

    Model(int imageView , String textview , String videoview){
        this.imageView = imageView;
        this.textview = textview;
        this.videoview = videoview;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTextview() {
        return textview;
    }

    public String getVideoview() {
        return videoview;
    }
}
