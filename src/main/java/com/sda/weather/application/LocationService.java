package com.sda.weather.application;

public class LocationService {

    private final LocationRepository locationRepository = new LocationRepository();

    public Location addNewLocation(final String citiName, final String regionName, final String countryName, final double latitude, final double longitude) {
        if (citiName == null || citiName.isEmpty()) {
            throw new RuntimeException("Pole z nazwą miasta nie może być puste! Wpisz poprawną wartość.");
        }
        if (countryName == null || countryName.isEmpty()) {
            throw new RuntimeException("Pole z nazwą państwa nie może być puste! Wpisz poprawną wartość.");
        }
        if (latitude < -90 || latitude > 90) {
            throw new RuntimeException("Niepoprawna szerokość geograficzna! Poprawny przedział wartości to: od -90 do + 90 stopni");
        }
        if (longitude < -180 || longitude > 180) {
            throw new RuntimeException("Niepoprawna długość geograficzna! Poprawny przedział wartości to: od -180 do + 190 stopni");
        }

        Location location = new Location(citiName, latitude, longitude, regionName, countryName);
        Location savedLocation = locationRepository.saveNewLocation(location);

        return savedLocation;
    }
}
