package at.htl.vehicle.vehicle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class VehicleDao {
    @Inject
    EntityManager entityManager;

    public Vehicle findById(long id) {
        //return entityManager.find(Vehicle.class, id);
        var query = entityManager.createQuery("select v from Vehicle v where v.id = :ID", Vehicle.class);
        return query.setParameter("ID", id).getSingleResult();
    }
    public List<Vehicle> findAll() {
        var query = entityManager.createQuery("select v from Vehicle v", Vehicle.class);
        return query.getResultList();
    }

    public void persist(Vehicle vehicle) {
        entityManager.persist(vehicle);
    }
}
