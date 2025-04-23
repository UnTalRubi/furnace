package edu.estatuas.furnace.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.estatuas.furnace.devices.GasHeater;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class GasHeaterTest {
    @Test
    public void testGasHeaterEngage() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20);
        GasHeater heater = new GasHeater();
        heater.engage(temperature);
        assertEquals(21.0, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testGasHeaterDisengage() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20);
        GasHeater heater = new GasHeater();
        heater.disengage(temperature);
        assertEquals(19.0, temperature.getTemperature(), 0.01);
    }
}
