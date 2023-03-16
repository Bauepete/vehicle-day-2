package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
@ApplicationScoped
public class PersonMapper {
    public PersonDto fromEntity(Person person) {
        return new PersonDto(person.getId(), person.getName(), person.getDob().toEpochDay());
    }
}
