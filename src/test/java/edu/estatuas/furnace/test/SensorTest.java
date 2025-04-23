package edu.estatuas.furnace.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.estatuas.furnace.devices.Sensor;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class SensorTest {
    @Test
    public void testSensorRead() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(25);
        Sensor sensor = new Sensor();
        assertEquals(25.0, sensor.read(temperature), 0.01);
    }
}
