package com.sda.weather.application;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.MetadataSource;

import java.util.Collections;
import java.util.List;

public class LocationRepository {

    private SessionFactory sessionFactory;

    public LocationRepository() {
        // todo: create the SessionFactory
        SessionFactory sessionFactory = new MetadataSource(serviceRegistry)
                .buildMetadata()
                .buildSessionFactory();
        sessionFactory = null;
    }

    public Location saveNeLocation(Location location) {
        return location;
    }

    public List<Location> readAllLocationsSaved() {
        return Collections.emptyList();
    }
}
