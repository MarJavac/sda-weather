package com.sda.weather;

import com.sda.weather.client.Client;

public class WeatherApp {
    public static void main(String[] args) {
        System.out.println("Witaj w WeatherApp!");
        Client client = new Client();
        Client.runClientInterface();

    }
}
