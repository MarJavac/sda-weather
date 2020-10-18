package com.sda.weather.application;

public class Location {

    private String name;
    private String coordinate;
    private String region;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(final String coordinate) {
        this.coordinate = coordinate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public Location(final String name, final String coordinate, final String region, final String country) {
        this.name = name;
        this.coordinate = coordinate;
        this.region = region;
        this.country = country;

    }
}
