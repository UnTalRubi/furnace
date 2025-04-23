package edu.estatuas.furnace.devices;

import edu.estatuas.furnace.interfaces.*;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class Regulator {

    public void regulate(Thermometer thermometer, Heater heater, double MIN_TEMP, double MAX_TEMP,
            RoomTemperature temperature) {

        while (temperature.getTemperature() < MIN_TEMP) {
            heater.engage(temperature);
            System.out.println("Heating... Current temperature: " + temperature.getTemperature());
        }

        while (temperature.getTemperature() > MAX_TEMP) {
            heater.disengage(temperature);
            System.out.println("Cooling... Current temperature: " + temperature.getTemperature());
        }
    }
}
