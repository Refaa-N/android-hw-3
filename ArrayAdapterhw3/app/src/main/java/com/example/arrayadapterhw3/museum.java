package com.example.arrayadapterhw3;

public class museum {
    private String museumName;
    private int museumImage;
    private String museumLocation;

    public static void add(museum m1) {
    }

    public String getMuseumName() {
        return museumName;
    }

    public void setMuseumName(String museumName) {
        this.museumName = museumName;
    }

    public int getMuseumImage() {
        return museumImage;
    }

    public void setMuseumImage(int museumImage) {
        this.museumImage = museumImage;
    }

    public String getMuseumLocation() {
        return museumLocation;
    }

    public void setMuseumLocation(String museumLocation) {
        this.museumLocation = museumLocation;
    }

    public museum(String museumName, int museumImage) {
        this.museumName = museumName;
        this.museumImage = museumImage;
        this.museumLocation = museumLocation;


    }
}
