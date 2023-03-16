package at.htl.vehicle.rental;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
@ApplicationScoped
public class RentalDao {
    @Inject
    EntityManager entityManager;

    public List<Rental> findAll() {
        return entityManager.createQuery("select r from Rental r", Rental.class)
                .getResultList();
    }
}
