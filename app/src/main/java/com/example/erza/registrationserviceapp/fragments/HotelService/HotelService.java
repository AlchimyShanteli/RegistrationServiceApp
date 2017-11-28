package com.example.erza.registrationserviceapp.fragments.HotelService;

/**
 * Created by Jora on 28.11.2017.
 */

public class HotelService {
    private String hotelService;
    private String hotelDescription;
    private String idUrlGallery;
    private String hotelReservation;

    public HotelService(String hotelService, String hotelDescription, String idUrlGallery, String hotelReservation) {
        this.hotelService = hotelService;
        this.hotelDescription = hotelDescription;
        this.idUrlGallery = idUrlGallery;
        this.hotelReservation = hotelReservation;
    }

    public String getHotelService() {
        return hotelService;
    }

    public void setHotelService(String hotelService) {
        this.hotelService = hotelService;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public String getIdUrlGallery() {
        return idUrlGallery;
    }

    public void setIdUrlGallery(String idUrlGallery) {
        this.idUrlGallery = idUrlGallery;
    }

    public String getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(String hotelReservation) {
        this.hotelReservation = hotelReservation;
    }
}
