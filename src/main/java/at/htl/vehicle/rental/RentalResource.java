package at.htl.vehicle.rental;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
@Path("rentals")
@Produces(MediaType.APPLICATION_JSON)
public class RentalResource {
    @Inject
    RentalDao rentalDao;
    @Inject
    RentalMapper rentalMapper;
    @GET
    public Response findAll() {
        var rentals = rentalDao.findAll()
                .stream()
                .map(rentalMapper::fromEntity)
                .toList();
        return Response.ok(rentals).build();
    }
}
