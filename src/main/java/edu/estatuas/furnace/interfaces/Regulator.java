package edu.estatuas.furnace.interfaces;

import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public interface Regulator {

    void regulate(Thermometer thermometer, Heater heater, double MIN_TEMP, double MAX_TEMP,
            RoomTemperature temperature);
}
