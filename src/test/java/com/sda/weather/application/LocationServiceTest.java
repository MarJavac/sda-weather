package com.sda.weather.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocationServiceTest {

    private final LocationService locationService = new LocationService();

    @Test
    void addNewLocation_shouldReturnNewLocalization() {
        // when
        Location location = locationService.addNewLocation("city", "region", "country", 0, 0);

        // then
        assertEquals(location.getName(), "city");
        assertEquals(location.getRegion(), "region");
        assertEquals(location.getCountry(), "country");
        assertEquals(location.getLatitude(), 0);
        assertEquals(location.getLongitude(), 0);
    }

    @Test
    void addNewLocation_whenCityIsEmpty_shouldThrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation(" ", "region", "country", 0, 0));

        // todo: tip isEmpty vs isBlank
    }

    @Test
    void addNewLocation_whenLongitudeIsBelow180Negative_shouldThrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", "region", "country", 0, -181));
    }
}
