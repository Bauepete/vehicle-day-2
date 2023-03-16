package at.htl.vehicle.vehicle;

import javax.enterprise.context.ApplicationScoped;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
@ApplicationScoped
public class VehicleMapper {
    public VehicleDto fromEntity(Vehicle vehicle) {
        return new VehicleDto(vehicle.getId(), vehicle.getBrand(), vehicle.getModel());
    }
}
