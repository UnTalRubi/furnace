package edu.estatuas.furnace.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import edu.estatuas.furnace.devices.*;
import edu.estatuas.furnace.miscelaneus.*;

public class JediTest {

    @Test
    public void testJediEngage() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20);
        Jedi yoda = new Jedi("Yoda");
        yoda.engage(temperature);
        assertEquals(1420.0, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testJediDisengage() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(1420);
        Jedi yoda = new Jedi("Yoda");
        yoda.disengage(temperature);
        assertEquals(20.0, temperature.getTemperature(), 0.01);
    }
}
