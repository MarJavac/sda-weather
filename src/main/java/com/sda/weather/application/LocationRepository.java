package com.sda.weather.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

import java.util.Collections;
import java.util.List;

public class LocationRepository {

    private SessionFactory sessionFactory;

    public LocationRepository() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        sessionFactory = new MetadataSources(serviceRegistry)
                .buildMetadata()
                .buildSessionFactory();
    }

    public Location saveNewLocation(Location location) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // todo use persist

        transaction.commit();
        session.close();

        // todo return a value returned by session.persist(...)
        return location;
    }

    public List<Location> readAllLocations() {
        // todo use createQuery and pass a HQL
        return Collections.emptyList();
    }
}
