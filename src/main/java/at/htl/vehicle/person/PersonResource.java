package at.htl.vehicle.person;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {

    @Inject
    PersonDao personDao;
    @Inject
    PersonMapper personMapper;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonDto findById(@PathParam("id") long id) {
        var personEntity = personDao.findById(id);
        return personMapper.fromEntity(personEntity);
    }
}
