package com.sda.weather.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String addLocation(String cityName, double latitude, double longitude, String regionName, String countryName) {
        Location location = new Location("", "", "", "");

        try {
            return objectMapper.writeValueAsString(location);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("...");
        }
    }
}
