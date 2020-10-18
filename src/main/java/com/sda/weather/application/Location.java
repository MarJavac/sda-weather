package com.sda.weather.application;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Double latitude;
    private Double longitude;
    private String region;
    private String country;

    public Location(String name, Double latitude, Double longitude, String region, String country) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.country = country;
    }
}
