package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.VehicleDto;

import java.math.BigDecimal;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
public record RentalDto(
        Long id,
        VehicleDto vehicle,
        long personId,
        long startDateTime,
        long endDateTime,
        double discount
) { }
