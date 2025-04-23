package edu.estatuas.furnace.interfaces;

import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public interface Thermometer {
    double read(RoomTemperature temperature);
}
