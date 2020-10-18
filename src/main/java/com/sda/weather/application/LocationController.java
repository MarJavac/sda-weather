package com.sda.weather.application;

import java.util.Scanner;

public class LocationController {
    private void addNewLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        String cityName = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną ");
        double latitude = scanner.nextDouble();
        System.out.println("Podaj długość geograficzną ");
        double longitude = scanner.nextDouble();
        System.out.println("Podaj region ");
        scanner.reset();
        String regionName = scanner.nextLine();
        System.out.println("Podaj nazwę kraju ");
        String countryName = scanner.nextLine();
    }
}
