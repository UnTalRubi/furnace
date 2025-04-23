package edu.estatuas.furnace.devices;

import edu.estatuas.furnace.miscelaneus.*;
import edu.estatuas.furnace.interfaces.Thermometer;

public class Sensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
