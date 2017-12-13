package com.example.erza.registrationserviceapp.hotelmodel;

/**
 * Created by Jora on 28.11.2017.
 */

public class HotelModel {
    private String name;
    private int id_;
    private int idUrlGallery;

    public HotelModel(String name, int id_, int idUrlGallery) {
        this.name = name;
        this.id_ = id_;
        this.idUrlGallery = idUrlGallery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public int getIdUrlGallery() {
        return idUrlGallery;
    }

    public void setIdUrlGallery(int idUrlGallery) {
        this.idUrlGallery = idUrlGallery;
    }
}
