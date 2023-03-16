package at.htl.vehicle.vehicle;

import io.agroal.api.AgroalDataSource;
import io.quarkus.narayana.jta.QuarkusTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.db.output.Outputs.output;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
@QuarkusTest // quarkus starts up
class VehicleDaoTest {
    @Inject
    VehicleDao vehicleDao;

    @Inject
    AgroalDataSource dataSource;
    @Test
    void itShouldStoreAVehicle_GivenPersistIsCalled() {
        var vehicle = new Vehicle("Opel", "eKadett");
        QuarkusTransaction.begin();
        vehicleDao.persist(vehicle);
        QuarkusTransaction.commit();

        var table = new Table(dataSource, "X_VEHICLE");
        // output(table).toConsole();
        assertThat(table).exists().hasNumberOfRows(1);
    }
}