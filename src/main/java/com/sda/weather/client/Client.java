package com.sda.weather.client;

import com.sda.weather.application.LocationController;

import java.util.Scanner;

public class Client {

    private final LocationController locationController = new LocationController();

    public void runClientInterface() {
        System.out.println("Witaj! Twoja aplikacja została uruchomiona");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu główne WeatherApp. Co chcesz zrobić?");
            System.out.println("1. Dodaj lokalizację do bazy danych");
            System.out.println("2. Wyświetl aktualnie dodane lokalizacje");
            System.out.println("3. Pobierz wartości pogodowe");
            System.out.println("0. Zamknij aplikację");

            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    addLocation();
                    break;
            }
        }
    }

    private void addLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        String cityName = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną ");
        double latitude = scanner.nextDouble();
        System.out.println("Podaj długość geograficzną ");
        double longitude = scanner.nextDouble();
        System.out.println("Podaj region ");
        scanner.nextLine();
        String regionName = scanner.nextLine();
        System.out.println("Podaj nazwę kraju ");
        String countryName = scanner.nextLine();

        String response = locationController.addLocation(cityName, latitude, longitude, regionName, countryName);
        System.out.println("Lokalizacja została dodana: " + response);
    }
}
