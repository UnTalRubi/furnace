package edu.estatuas.furnace.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.estatuas.furnace.devices.GasHeater;
import edu.estatuas.furnace.devices.Controller;
import edu.estatuas.furnace.devices.Sensor;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class RegulatorTest {

    @Test
    public void testRegulate() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(25);
        GasHeater heater = new GasHeater();
        Sensor sensor = new Sensor();
        Controller regulator = new Controller();
        regulator.regulate(sensor, heater, 15.0, 20.0, temperature);
        assertEquals(15.0, temperature.getTemperature(), 0.01);
    }
}
