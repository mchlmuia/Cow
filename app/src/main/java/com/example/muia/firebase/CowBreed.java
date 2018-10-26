package com.example.muia.firebase;

public class CowBreed {

    private String Name;
    private String Indetification;
    private int Photo;

    public CowBreed() {
    }

    public CowBreed(String name, String indetification, int photo) {
        Name = name;
        Indetification = indetification;
        Photo = photo;
    }

    //Getter


    public String getName() {
        return Name;
    }

    public String getIndetification() {
        return Indetification;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setIndetification(String indetification) {
        Indetification = indetification;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
