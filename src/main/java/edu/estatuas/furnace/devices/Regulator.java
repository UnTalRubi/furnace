package edu.estatuas.furnace.devices;

import edu.estatuas.furnace.interfaces.*;
import edu.estatuas.furnace.miscelaneus.*;

public class Regulator {

    public void regulate(Thermometer thermometer, Heater heater, double MIN_TEMP, double MAX_TEMP,
            RoomTemperature temperature) {

        System.out.println("Initial temperature: " + thermometer.read(temperature));

        while (thermometer.read(temperature) < MAX_TEMP) {
            heater.engage(temperature);
            System.out.println("Heating... Current temperature: " + temperature.getTemperature());
        }

        while (thermometer.read(temperature) > MIN_TEMP) {
            heater.disengage(temperature);
            System.out.println("Cooling... Current temperature: " + temperature.getTemperature());
        }
    }
}
