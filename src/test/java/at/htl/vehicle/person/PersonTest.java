package at.htl.vehicle.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Copyright 2023 by Bajupa.com
 * Created by peter on 16.03.23.
 */
class PersonTest {
    @Test
    void itShouldHaveNameSusi_GivenNameSusiWhenConstructed() {
        var person = new Person("Susi", LocalDate.of(2000, Month.APRIL, 10));
        assertThat(person.getName()).isEqualTo("Susi");
    }
}