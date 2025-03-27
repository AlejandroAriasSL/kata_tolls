package dev.alejandro.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StationTest {

    @Test
    @DisplayName("It should return the name attribute")
    void test_should_return_name_of_station(){

        String name = "Ogrimmar";
        
        Station station = new Station(name);

        assertThat(station.getName(), is(name));
    }
}